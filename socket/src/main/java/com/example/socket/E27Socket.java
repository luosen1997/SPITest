package com.example.socket;

/**
 * @author 四夕三木
 * @date 2023/1/17 16:29
 */
public interface E27Socket {

    /**
     * 协议是否支持
     * @param name
     * @return
     */
    boolean isSupport(String name);

    /**
     * 灯开了
     */
    void open();

    /**
     * 灯亮了
     */
    void bright();

    /**
     * 灯关了
     */
    void off();
}
