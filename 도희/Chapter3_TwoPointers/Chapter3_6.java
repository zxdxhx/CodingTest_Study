package CodingTest_Study.도희.Chapter3_TwoPointers;

import java.util.Scanner;

public class Chapter3_6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int k = scan.nextInt();

        int[] arr = new int[num];
        for(int i = 0; i<num; i++){
            arr[i] = scan.nextInt();
        }
        int start = 0, end = 0, count = 0;
        int max = 0;
        while(end<num){
            if(arr[end]==0&&count<k){
                end++; count++;
            }
            else if(arr[end]==0 && count==k){
                max = Math.max(max, end-start);
                start++; end = start; count = 0;
            }
            else if(arr[end]==1){
                end++;
            }
        }
        System.out.println(max);
    }
}
