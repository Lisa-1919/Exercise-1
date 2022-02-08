package by.trainning;

public class Task8 {

    public static void main(String[] args) {
        int[] a = new int[10];
        int k = (int) (Math.random() * 10);
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 200 - 100);
            System.out.print(a[i] + " ");
            if (a[i] % k == 0) {
                sum += a[i];
            }
        }
        System.out.println("\nK = " + k + "\nSum = " + sum);
    }
}
