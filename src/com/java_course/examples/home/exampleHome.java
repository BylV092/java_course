package com.java_course.examples.home;

import com.java_course.examples.garden.Dog;
import static com.java_course.examples.home.people.saludar;

public class exampleHome {
    public static void main(String[] args) {
        people p = new people();
        Dog d = new Dog();
        String saludos = saludar();
    }
}
