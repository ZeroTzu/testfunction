package org.example;
public class Body {
    private String imageBase64;
    private int age;

    // Default constructor
    public Body() {}

    // Constructor with fields (optional)
    public Body(String imageBase64 ) {
        this.imageBase64 = imageBase64;
    }

    // Getters and Setters
    public String getName() {
        return imageBase64;
    }

    public void setName(String name) {
        this.imageBase64 = name;
    }
}