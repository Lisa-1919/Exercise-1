package by.trainning;

public class Task6 {

    public static void main(String[] args) {
        int a = (int) (Math.random() * 20 - 10);
        int b = (int) (Math.random() * 20 - 10);
        int c = (int) (Math.random() * 20 - 10);

        int max;
        int min;
        int sum;

        max = a > b ? a : b;
        max = c > max ? c : max;

        min = a < b ? a : b;
        min = c < min ? c : min;

        sum = max + min;

        System.out.println("a = " + a + "\nb = " + b + "\nc = " + c + "\nsum = " + sum);

    }
}
