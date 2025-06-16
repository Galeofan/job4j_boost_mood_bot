package ru.job4j.bmb.config;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppConfig {

    @Value("${telegram.bot.name}")
    String appName;

    @PostConstruct
    public void printConfig() {
        System.out.println("App Name: " + appName);
    }
}
