package by.trainning;

public class Task1 {

    public static void main(String[] args) {
        int number = 4545;
        int a = number / 1000;
        int b = number / 100 - a * 10;
        int c = number / 10 - a * 100 - b * 10;
        int d = number - a * 1000 - b * 100 - c * 10;
        boolean flag = (a + b == c + d) ? true : false;
        System.out.println("a = " + a + "\nb = " + b + "\nc = " + c + "\nd = " + d);
        System.out.println(flag);
    }
}
