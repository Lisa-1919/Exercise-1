package by.trainning;

public class Task5 {

    public static void main(String[] args) {
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (10 - Math.random() * 20);
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                arr[i] *= arr[i];
            } else {
                arr[i] = (int) Math.pow(arr[i], 4);
            }

            System.out.print(arr[i] + " ");
        }
    }
}
