package com.javacourse.firtsmetting;

public class Test {
    public static void main(String[] args) {
        String t = "The life is wild";
        int count=0;
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                System.out.println("Vowel found: (" + c +") in the position : "+ i);
                count++;
            }
        }
        System.out.println("The amount of vowels in the sentence is: " + count);
    }
}
