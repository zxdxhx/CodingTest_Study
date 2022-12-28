package CodingTest_Study.도희.Chapter2_Array;

import java.util.Scanner;

public class Chapter2_8 {
    static int num;
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        int[] arr = new int[num];
        for(int i = 0; i< num; i++){
            arr[i] = scan.nextInt();
        }
        int[] rank = new int[num];
        for(int i = 0; i< num; i++){
            int curr= 1;
            for(int j = 0; j<num; j++){
                if(i == j) continue;
                if(arr[i] < arr[j]){
                    curr++;
                }
            }
            rank[i] = curr;
        }
        for(int x :rank){
            System.out.print(x+" ");
        }
    }
}
