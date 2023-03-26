package CodingTest_Study.정환.Chapter6_Sort;

import java.util.Arrays;
import java.util.Scanner;

public class Chapter6_10 {
    public static void main(String[] args) {
        //강의봤습니다..
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int c = sc.nextInt();
        int answer = 0;
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int lt = 1;
        int rt = arr[arr.length-1];

        while(lt<=rt){
            int count = 1;
            int ep = arr[0];
            int mid = (lt+rt)/2;
            for(int i=1; i<arr.length; i++){
             if(arr[i]-ep>=mid){
                 ep = arr[i];
                 count++;
             }
            }

            if(count >= c){
                answer = Math.max(answer, mid);
                lt = mid+1;
            }
            else{
                rt = mid-1;
            }
        }
        System.out.println(answer);
    }
}
