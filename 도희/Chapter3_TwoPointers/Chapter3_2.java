package CodingTest_Study.도희.Chapter3_TwoPointers;

import java.util.*;

public class Chapter3_2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] arr = new int[num];
        for(int i = 0; i<num; i++){
            arr[i] = scan.nextInt();
        }
        int num2 = scan.nextInt();
        int[] arr2 = new int[num2];
        for(int i = 0; i<num2; i++){
            arr2[i] = scan.nextInt();
        }

        Arrays.sort(arr);
        Arrays.sort(arr2);
        int p1 = 0; int p2 = 0;
        String answer ="";
        while(p1<num && p2<num2){
            if(arr[p1]<arr2[p2]){
                p1++;
            }else if(arr[p1]>arr2[p2]){
                p2++;
            }else if(arr[p1]==arr2[p2]){
                answer += arr[p1]+" ";
                p1++; p2++;
            }
        }
        System.out.println(answer);
    }
}
