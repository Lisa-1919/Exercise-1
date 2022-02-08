package by.trainning;

public class Task3 {

    public static void main(String[] args) {
        int a = (int)(Math.random()*10);
        int b = (int)(Math.random()*10);

        double perimeter;
        double square;

        perimeter = Math.sqrt(a*a + b*b) + a + b;
        square = a*b/2.;

        System.out.println("a = " + a + "\nb = " + b +"\nperimeter = " + perimeter + "\nsquare = " + square);
    }
}
