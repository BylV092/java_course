package com.example.archive;

import com.example.archive.services.ArchiveServices;

public class ExampleCreateArchive {
    public static void main(String[] args) {
        String nameArchive = "C:\\Users\\Breider\\Documents\\java-course\\Files\\java.txt";
        ArchiveServices sercices = new ArchiveServices();
        sercices.createArchive2(nameArchive );

    }
}
