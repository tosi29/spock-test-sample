package com.example.spocktestsample;

public class SampleEntity {
    private String name;
    private String address;

    public SampleEntity(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return name + " " + address;
    }
}
