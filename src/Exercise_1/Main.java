package Exercise_1;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[]{1, 1, -5, 3, -5, 7, 1, 3, 4, 3, 4,-5, 7};
        System.out.println(search(a));
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
