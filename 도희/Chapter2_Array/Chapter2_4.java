package CodingTest_Study.도희.Chapter2_Array;

import java.util.Scanner;

public class Chapter2_4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        String answer = "";
        int[]  arr = new int[num];
        arr[0] = 1;
        arr[1] = 1;
        for(int i = 2; i < num; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}
