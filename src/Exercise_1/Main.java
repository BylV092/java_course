package Exercise_1;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[]{1, 1, 5, 3, 0, 4, 3, 1};
        System.out.println(search(a));
    }

    public static int search(int[] a) {
        int[] b = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            int g = a[i];
            int countg = 0;
            for (int j = 0; j < a.length; j++) {
                if (g == a[j]) {
                    countg++;
                    b[i] = countg;
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
