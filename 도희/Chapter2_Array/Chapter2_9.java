package CodingTest_Study.도희.Chapter2_Array;

import java.util.Scanner;

public class Chapter2_9 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int[][] arr = new int[num][num];
        int[] sum = new int[num+2];
        for(int i  = 0; i< num; i++){
            for(int j = 0; j<num; j++){
                arr[i][j] = scan.nextInt();
            }
        }
        int max = 0;
        for(int i  = 0; i< num; i++){
            int rowtotal = 0;
            int coltotal = 0;
            for(int j = 0; j<num; j++){
                rowtotal += arr[i][j]; //행의 합
                coltotal += arr[j][i]; //열의 합
            }
            max = Math.max(rowtotal, max);
            max = Math.max(coltotal, max);
        }

        int dia1=0;
        int dia2=0;
        for(int i = 0; i< num; i++){
            for(int j = 0; j < num; j++){
                if(i==j){
                    dia1 += arr[i][j];
                }
                if(i+j == num){
                    dia2 += arr[i][j];
                }
            }
        }
        max = Math.max(dia1, max);
        max = Math.max(dia2, max);

        System.out.println(max);
    }
}