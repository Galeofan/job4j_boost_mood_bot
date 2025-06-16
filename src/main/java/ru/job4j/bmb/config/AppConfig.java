package ru.job4j.bmb.config;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppConfig {

    @Value("${telegram.bot.name}")
    String botName;
    @Value("${telegram.bot.token}")
    String botToken;

    @PostConstruct
    public void printConfig() {
        System.out.println("AppConfig | botName: " + botName);
        System.out.println("AppConfig | botToken: " + botToken);
    }
}
