package com.java_course.examples.garden;

import com.java_course.examples.home.people;

import static com.java_course.examples.home.people.*;
public class exampePackage {
    public static void main(String[] args) {
        people p = new people();
        p.setName("James");
        System.out.println("p.name = " + p.getName());
        Dog d = new Dog();
        d.named = "toby";
        d.rice = "Bulldog";
        String playing = d.play(p);
        System.out.println("playing = " + playing);
        String saludo = saludar();
        System.out.println("saludo = " + saludo);

    }
}
