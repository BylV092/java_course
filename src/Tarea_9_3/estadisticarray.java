package Tarea_9_3;

import java.util.Scanner;

public class estadisticarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positiveCounter = 0, negativeCounter = 0, zerocounter = 0;
        double positiveSum = 0, averagePositive, negativeSum = 0, averageNegative;
        int[] principal = new int[7];
        for (int i = 0; i < principal.length; i++) {
            System.out.println("  Enter the data in position : " + i);
            principal[i] = scanner.nextInt();
            if (principal[i] > 0) {
                positiveSum += principal[i];
                positiveCounter++;
            } else if (principal[i] < 0) {
                negativeSum += principal[i];
                negativeCounter++;
            } else if (principal[i] == 0) {
                zerocounter++;
            }
        }
        averagePositive = positiveSum / positiveCounter;
        System.out.println("The average of the positive data entered is: " + averagePositive);
        averageNegative = negativeSum / negativeCounter;
        System.out.println("The average of the negative data entered is: " + averageNegative);
        System.out.println("The number of zeros is:" + zerocounter);
    }
}
