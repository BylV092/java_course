package alfanumeric;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Thread threadNumbers = new Thread(new Alfanumeric(Type.Number));
        Thread threadLetters = new Thread(new Alfanumeric(Type.Letter));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Thread to run: " +
                "\n1 for Numbers Thread." +
                "\n2 for Letters Thread.");
        int d = scanner.nextInt();
        if (d  ==1 || d==2){
            if (d == 1) {
                threadNumbers.start();
            } else if (d == 2) {
                threadLetters.start();
            }
        }else {
            System.err.println("ERROr: //Option enter invalid");
        }
    }
}
