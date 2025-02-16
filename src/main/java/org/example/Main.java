package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(projectConfig.class);
                Flower flower = context.getBean(Flower.class);
                System.out.println("Flower type: " + flower.getName());
                Wrapping wrapping = context.getBean(Wrapping.class);
                System.out.println("Wrapping type: " + wrapping.getType());
    }
}