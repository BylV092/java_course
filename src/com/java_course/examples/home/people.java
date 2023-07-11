package com.java_course.examples.home;

public class people {
    private String name;
    private String lastName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName () {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String lanzarPelota() {
        return name + " lanza un palo";
    }

    public static String saludar() {
        return "hellow world!";
    }
}
