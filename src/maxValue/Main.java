package maxValue;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] num = {12, 67, 45, 34, 28, 19, 223543, 7543211};
        int maxValue = Arrays.stream(num)
                .reduce(Integer.MIN_VALUE, (a, b) -> Integer.max(a, b));
        System.out.println("maxValue = " + maxValue);
    }
}
