package countWords;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String input = "This is a test message to know the number of times and repetitions of a specific word within a sentence of multiple words\n";

        Map<String, Integer> wordsCount = wordMoreRepeat(input);

        System.out.println("The word more repeat is: " + wordsCount.keySet().iterator().next());
        System.out.println("The word is repeat: " + wordsCount.values().iterator().next());

    }

    public static Map<String, Integer> wordMoreRepeat(String sentence) {
        String[] words = sentence.split("\\s+");
        Map<String, Integer> count = new HashMap<>();

        Arrays.stream(words)
                .forEach(word -> count.put(word, count.getOrDefault(word, 0) + 1));

        int max = Collections.max(count.values());

        return Collections.singletonMap(
                count.entrySet().stream()
                        .filter(entry -> entry.getValue() == max)
                        .findFirst()
                        .map(Map.Entry::getKey)
                        .orElse(""),
                max
        );
    }
}
