package ru.spvrent.springHustonMVC.model;

import lombok.Data;

@Data
public class Pupil {
    private String firstName;
    private String lastName;
    private Country country;
    private Gender gender;
    private Car car;
}
