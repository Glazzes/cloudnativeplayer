package com.glaze.cloudnativeplayer.song;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableFeignClients
@SpringBootApplication
@RestController
public class CloudNativePlayerSongApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudNativePlayerSongApplication.class);
    }

    @GetMapping("/")
    public String hello() {
        return "Hello world";
    }

}
