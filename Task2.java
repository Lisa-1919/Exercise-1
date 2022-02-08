package by.trainning;

public class Task2 {

    public static void main(String[] args) {
        int a = (int) (Math.random() * 10);
        int b = (int) (Math.random() * 10);
        int c = (int) (Math.random() * 10);
        double result;

        result = (b+Math.sqrt(b*b+4*a*c))/(2*a) - Math.pow(a,3)*c + Math.pow(b, -2);

		System.out.println("a = " + a + "\nb = " + b+ "\nc = " + c + "\nresult = " + result);
    }
}
