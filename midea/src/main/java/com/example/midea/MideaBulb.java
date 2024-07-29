package com.example.midea;

import com.example.socket.E27Socket;

/**
 * @author 四夕三木
 * @date 2023/1/18 13:13
 */
public class MideaBulb implements E27Socket {

    private final String MIDEA = "E27Socket:Midea:Bulb";
    @Override
    public boolean isSupport(String accord) {
        if (accord.equals(MIDEA)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void open() {
        System.out.println("美的灯开了");
    }

    @Override
    public void bright() {
        System.out.println("美的灯亮了");
    }

    @Override
    public void off() {
        System.out.println("美的灯关了");
    }
}
