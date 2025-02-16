package org.example;

import org.springframework.stereotype.Component;

@Component
public class Wrapping {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}