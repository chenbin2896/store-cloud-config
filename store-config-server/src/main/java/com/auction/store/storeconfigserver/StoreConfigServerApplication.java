package com.auction.store.storeconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class StoreConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(StoreConfigServerApplication.class, args);
    }

}
