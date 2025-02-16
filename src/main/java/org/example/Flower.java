package org.example;

import org.springframework.stereotype.Component;

@Component
public class Flower {
    private String name;
    private String colour;

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}