package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class projectConfig {
    @Bean
    Flower flowerIris() {
        Flower flower = new Flower();
        flower.setName("Iris");
        flower.setColour("White");
        return flower;
    }
    @Bean
    Flower flowerTulip() {
        Flower flower = new Flower();
        flower.setName("Tulip");
        flower.setColour("Yellow");
        return flower;
    }
    @Bean
    @Primary
    Flower flowerRose() {
        Flower flower = new Flower();
        flower.setName("Rose");
        flower.setColour("Pink");
        return flower;
    }
    @Bean
    Wrapping type1() {
        Wrapping wrapping = new Wrapping();
        wrapping.setType("Shiny with stars");
        return wrapping;
    }
}
