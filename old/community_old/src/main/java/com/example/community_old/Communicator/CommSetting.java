package com.example.community_old.Communicator;

import lombok.Getter;
import org.springframework.context.annotation.Configuration;

@Getter
@Configuration
public class CommSetting {
    private final String authenticationAddress;

    public CommSetting() {
        authenticationAddress = "http://127.0.0.1:9004";
    }
}