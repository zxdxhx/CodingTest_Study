package CodingTest_Study.도희.Chapter2_Array;

import java.util.*;
public class Chapter2_2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.nextLine();
        int[] arr = new int[num];

        for(int i = 0; i< num; i++){
            arr[i] = scan.nextInt();
        }

        int min =  arr[0];
        int count = 1;
        for(int i = 1; i< num; i++){
            if(min < arr[i]){
                min = arr[i];
                count++;
            }
        }
        System.out.println(count);
    }
}
