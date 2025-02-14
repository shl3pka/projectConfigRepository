package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class projectConfig {
    @Bean
    Parrot parrot() {
        Parrot parrot = new Parrot();
        parrot.setName("Kesha");
        return parrot;
    }
    @Bean
    Parrot parrotMike() {
        Parrot parrot = new Parrot();
        parrot.setName("Mike");
        return parrot;
    }
    @Bean
    @Primary
    Parrot parrotBob() {
        Parrot parrot = new Parrot();
        parrot.setName("Bob");
        return parrot;
    }

}
