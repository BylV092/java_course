package lambda;
import java.util.function.Function;

public class Remove {
    public static void main(String[] args) {
        String input = "! Hello! How are you? Today we will go to cinema, park and shopping.";
        Function<String, String> removeSymbols = (sentence) -> {
            String result = sentence.replaceAll("[ .,¿?!]", "");
            return result.toUpperCase();
        };
        System.out.println("Sentence original: \n" + input);
        String output = removeSymbols.apply(input);
        System.out.println("Sentence result: \n" + output);

    }
}
