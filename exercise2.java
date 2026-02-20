import java.util.Scanner;

public class exercise2 {

    public static int min(int[] a) {
        int m = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < m) m = a[i];
        }
        return m;
    }

    public static int max(int[] a) {
        int M = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > M) M = a[i];
        }
        return M;
    }

    public static int[] minMax(int[] a) {
        int min = a[0];
        int max = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) min = a[i];
            if (a[i] > max) max = a[i];
        }

        return new int[]{min, max};
    }

    public static void main(String[] args) {

        int[] a;

        if (args.length > 0) {
            a = new int[args.length];
            for (int i = 0; i < args.length; i++) {
                a[i] = Integer.parseInt(args[i]);
            }
        } else {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter numbers separated by space:");
            String[] parts = s.nextLine().split("\\s+");

            a = new int[parts.length];
            for (int i = 0; i < parts.length; i++) {
                a[i] = Integer.parseInt(parts[i]);
            }
            s.close();
        }

        System.out.println("Min = " + min(a));
        System.out.println("Max = " + max(a));

        int[] mm = minMax(a);
        System.out.println("Both: " + mm[0] + ", " + mm[1]);
    }
}