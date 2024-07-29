package com.example.room;

import com.example.socket.E27Socket;

/**
 * @author 四夕三木
 * @date 2023/1/18 13:22
 */
public class LightRoom {
    private E27Socket e27Socket;

    public LightRoom(E27Socket e27Socket) {
        this.e27Socket = e27Socket;
    }

    public void lightShow() {
        this.e27Socket.open();
        this.e27Socket.bright();
        this.e27Socket.off();
    }
}
