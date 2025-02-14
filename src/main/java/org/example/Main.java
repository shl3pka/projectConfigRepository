package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(projectConfig.class);
                Person person = context.getBean(Person.class);
                person.setName("Max");
    }
}