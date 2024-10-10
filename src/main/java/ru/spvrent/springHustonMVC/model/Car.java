package ru.spvrent.springHustonMVC.model;

public enum Car {
    BMW("BMW"), AUDI("Audi"), HONDA("HONDA");

    private final String displayName;


    Car(String displayName) {
        this.displayName = displayName;
    }


    public String getDisplayName() {
        return displayName;
    }
}
