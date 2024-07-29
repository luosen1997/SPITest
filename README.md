# SPITest

socket项目为灯泡螺口项目，规定螺口规格为E27
Midea、xiaomi项目为灯泡品牌项目，分别为美的灯泡和小米灯泡
room项目为需要灯泡照亮的房间项目

灯泡螺口项目规定好灯泡螺口的规格接口，美的灯泡和小米灯泡分别在pom.xml文件里引入灯泡螺口项目的依赖，然后分别实现规格接口生产出自己品牌的灯泡。

房间需要哪个品牌的灯泡就在pom.xml文件里引入哪个品牌的依赖，然后就可以测试灯泡，点亮房间了。

房间也可以同时引入两个品牌的依赖，只要在螺口项目的接口里新增一个抽象方法（协议是否支持）。
美的和小米分别实现这个方法，规定好自己灯泡的点亮协议，并在resources文件下创建META-INF文件，在META-INF文件下创建services文件，在services文件下创建com.example.socket.E27Socket文件（文件名与螺口项目接口的路径一致）在文件里增加com.example.midea.MideaBulb（美的灯泡的实现类路径，小米的换成小米灯泡的实现类路径）。
房间此时需要使用ServiceLoader<E27Socket> bulbs = ServiceLoader.load(E27Socket.class);通过ServiceLoader加载接口socket的实现类，那它怎么去找呢？就是去扫描所有jar包的resources中META-INF/services/com.example.midea.MideaBulb文件中的值。然后房间给出一个灯泡协议，符合协议的灯泡才能被点亮。
