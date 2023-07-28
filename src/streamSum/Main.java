package streamSum;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int[] array = IntStream.rangeClosed(1, 100).toArray();
        double result = IntStream.of(array)
                .filter(num -> num % 10 != 0)
                .mapToDouble(num -> (double) num / 2)
                .reduce(0.0, Double::sum);
        System.out.println("result = " + result);
    }
}

