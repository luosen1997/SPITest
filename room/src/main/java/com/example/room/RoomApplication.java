package com.example.room;

import com.example.socket.E27Socket;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ServiceLoader;

@SpringBootApplication
public class RoomApplication {

    // @Value("${accord}")
    // private String accord;

    public static void main(String[] args) {
        // SpringApplication.run(RoomApplication.class, args);

        // E27Socket bulb = new MideaBulb();
        // LightRoom lightRoom = new LightRoom(bulb);
        // lightRoom.lightShow();

        String accord = "E27Socket:Xiaomi:Bulb";

        ServiceLoader<E27Socket> bulbs = ServiceLoader.load(E27Socket.class);
        for (E27Socket bulb : bulbs) {
            if (bulb.isSupport(accord)) {
                LightRoom lightRoom = new LightRoom(bulb);
                lightRoom.lightShow();
            }
        }
    }

}
