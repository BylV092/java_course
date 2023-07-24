package alfanumeric;

public class Main {
    public static void main(String[] args) {
        Thread threadNumbers = new Thread(new Alfanumeric(Type.Number));
        Thread threadLetters = new Thread(new Alfanumeric(Type.Letter));
        threadNumbers.start();
        try {
            threadNumbers.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadLetters.start();
    }


}

