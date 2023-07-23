package alfanumeric;

public class Alfanumeric implements Runnable {
    private Type type;

    public Alfanumeric(Type type) {
        this.type = type;
    }

    @Override
    public void run() {

        if (type == Type.Number) {
            System.out.println("Thread Number");
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        } else if (type == Type.Letter) {
            System.out.println("Thread Letters");
            for (char c = 'A'; c <= 'Z'; c++) {
                System.out.println(c);
            }
        }
    }
}
