package com.example.archive;

import com.example.archive.services.ArchiveServices;

public class ExampleReadArchive {
    public static void main(String[] args) {
        String nameArchive = "C:\\Users\\Breider\\Documents\\java-course\\Files\\java.txt";
        ArchiveServices services = new ArchiveServices();
        System.out.println(services.readFile2(nameArchive));

    }
}
