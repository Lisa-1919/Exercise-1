package by.trainning;

public class Task7 {

    public static void main(String[] args) {
        int a = -10;
        int b = 10;
        double h = 1.5;
        double f;

        double x = a;
        while (x<=b){
            f = Math.pow(Math.sin(x), 2) - Math.cos(2*x);
            System.out.println("x = " + x + " \tF(x) = " + f);
            x+=h;
        }
    }
}
