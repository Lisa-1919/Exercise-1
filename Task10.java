package by.trainning;

public class Task10{

    public static void main(String[] args) {
        int n = 6;
        int[][] arr = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i % 2 == 0){
                    arr[i][j] = j + 1;
                }
                else{
                    arr[i][j] = n - j;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
