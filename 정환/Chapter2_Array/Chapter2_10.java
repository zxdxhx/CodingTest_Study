package CodingTest_Study.정환.Chapter2_Array;

import java.util.Scanner;

public class Chapter2_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[][] = new int[n+2][n+2];

        for(int i=1; i<array.length-1; i++){
            for(int j=1; j<array.length-1; j++){
                array[i][j] = sc.nextInt();
            }
        }
        int result = 0;
        for(int i=1; i<array.length-1; i++){
            for(int j=1; j<array.length-1; j++){
                if(array[i][j]>array[i][j-1]&&
                        array[i][j]>array[i+1][j]&&
                        array[i][j]>array[i-1][j]&&
                        array[i][j]>array[i][j+1]){
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}
