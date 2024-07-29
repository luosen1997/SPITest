package com.example.xiaomi;


import com.example.socket.E27Socket;

/**
 * @author 四夕三木
 * @date 2023/1/17 17:31
 */
public class XiaomiBulb implements E27Socket {
    private final String XIAOMI = "E27Socket:Xiaomi:Bulb";

    @Override
    public boolean isSupport(String accord) {
        if (accord.equals(XIAOMI)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void open() {
        System.out.println("小米灯开了");
    }

    @Override
    public void bright() {
        System.out.println("小米灯亮了");
    }

    @Override
    public void off() {
        System.out.println("小米灯关了");
    }
}
