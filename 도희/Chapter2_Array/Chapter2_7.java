
package CodingTest_Study.도희.Chapter2_Array;

import java.util.*;

public class Chapter2_7 {
    static int num;
    public static int fun(int[] arr){
        int[] score = new int[arr.length];
        int total = arr[0];
        score[0] = arr[0];
        for(int i = 1; i< num; i++){
            if(arr[i] == 1){
                score[i] = score[i-1]+1;
                total += score[i];
            }else{
                score[i] = 0;
            }
        }
        return total;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        num =scan.nextInt();
        int[] arr = new int[num];

        for(int i = 0; i<num; i++){
            arr[i] = scan.nextInt();
        }
        int answer = fun(arr);
        System.out.println(answer);
    }

}
