package CodingTest_Study.도희.Chapter2_Array;

import java.util.Scanner;

public class Chapter2_10 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[][] arr = new int[num+2][num+2];

        for(int i = 1 ; i< num+1; i++){
            for(int j = 1; j<num+1; j++){
                arr[i][j] = scan.nextInt();
            }
        }
        int count = 0;
        for(int i = 1 ; i< num+1; i++){
            for(int j = 1; j<num+1; j++){
                if(arr[i][j-1] < arr[i][j] && arr[i-1][j] < arr[i][j] &&
                        arr[i+1][j] < arr[i][j] && arr[i][j+1] < arr[i][j] )        {
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}
