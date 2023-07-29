package deleteRepeats;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String [][] languajes = {{"java", "groovy"}, {"php"}, {"c#", "python", "groovy"}, {"java", "javascript", "kotlin"}, {"javascript"}};

        String[] resul = Arrays.stream(languajes)
                .flatMap(Arrays::stream)
                .distinct()
                .toArray(String[]::new);

        for (int i = 0; i< resul.length;i++){
            System.out.println(resul[i]);
        }
    }
}
