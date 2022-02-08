package by.trainning;

public class Task9 {

    public static void main(String[] args) {
        int[] arr1 = {2, 6, 8, 1, -5, 5, -13};
        int[] arr2 = {-2, 78, 1, 0, 56, 3, -5, 9, 12, 6};
        int[] arr3 = new int[arr1.length + arr2.length];
        int k = 3;

        for(int i = 0; i < k; i++){
            arr3[i] = arr1[i];
        }

        for(int i = 0; i < arr2.length; i++){
            arr3[k + i] = arr2[i];
        }

        for(int i = k; i < arr1.length; i++){
            arr3[i + arr2.length] = arr1[i];
        }

        for(int elem:arr3){
            System.out.print(elem + " ");
        }
    }
}
