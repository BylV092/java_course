package exampleOverload;

public class calculatorAdd {
    public static int add(int... arguments) {

        int total = 0;
        for (int i = 0; i < arguments.length; i++) {
            total += i;
        }
        return total;
    }

    static int add(int a, int b) {
        return a * b / 2;
    }

    public static float add(float a, int b) {
        return a + b;
    }

    public static float add(int a, float b) {
        return a + b;
    }

    public static float add(float a, float b) {
        return a + b;
    }

    public static double add(double x, double y) {
        return y + x;
    }

    public static int add(String a, String b) {
        int r;
        try {
            r = Integer.parseInt(a) + Integer.parseInt(b);
        } catch (NumberFormatException e) {
            r = 0;
        }
        return r;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }
}
