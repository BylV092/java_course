package com.example.archive.services;

import java.io.*;
import java.util.Scanner;

public class ArchiveServices {
    public void createArchive(String name){
        File archive = new File(name);
        try (BufferedWriter buffer = new BufferedWriter(new FileWriter(archive, true))){
            buffer.append("\nHellow guys")
                    .append("\nHow are you?")
                    .append("\nGood bye ...");
            System.out.println("The file has be created !");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void createArchive2(String name){
        File archive = new File(name);
        try (PrintWriter buffer = new PrintWriter(new FileWriter(archive, true))){
            buffer.println("\nHellow guys");
                    buffer.println("\nHow are you?");
                    buffer.println("\nGood bye ...");
            System.out.println("The file has be created !");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public String readFile (String name){
        StringBuilder sb = new StringBuilder();
        File archive = new File(name);
        try (BufferedReader reader = new BufferedReader(new FileReader(archive))){
            String line;
            while ( (line = reader.readLine())!= null){
                sb.append(line).append("\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }
    public String readFile2 (String name){
        StringBuilder sb = new StringBuilder();
        File archive = new File(name);
        try (Scanner s = new Scanner(archive)){
            s.useDelimiter("\n");
            while (s.hasNext() ){
                sb.append(s.hasNext()).append("\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }
}
