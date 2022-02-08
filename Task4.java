package by.trainning;

public class Task4 {

    public static void main(String[] args) {
        int x = (int)(Math.random() * 20 - 10);
        int y = (int)(Math.random() * 20 - 10);

        boolean flag = false;

        if((x >= -4 && x<= 4) && (y>= -3 && y <= 0))
            flag = true;
        if((x >= -2 && x <= 2) && (y >=0 && y <= 4))
            flag = true;

        System.out.println("x = " + x + " y = " + y + " " + flag);
    }
}
