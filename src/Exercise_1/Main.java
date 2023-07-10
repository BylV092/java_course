package Exercise_1;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[]{1, 1, -5, 3, -5, 7, 1, 3, 4, 3, 4,-5, 7};
         System.out.println(searchPro(a));
    }

    public static int searchPro(int[] a) {
        var counts = new HashMap<Integer, Integer>();
        for (var num : a) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }
        System.out.println(counts);
        return -1;
    }

    public static int search(int[] a) {
        int[] b = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    b[i]++;
                }
            }
        }
        int index = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i] < b[index]) {
                index = i;
            }
        }
        return a[index];
    }

}
