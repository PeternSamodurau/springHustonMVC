package ru.spvrent.springHustonMVC.model;

public enum Country {
    US("США"),
    BY("Беларусь"),
    UA("Украина");

    private final String displayName;

    Country(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
