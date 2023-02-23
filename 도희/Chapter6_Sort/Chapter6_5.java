package CodingTest_Study.도희.Chapter6_Sort;

import java.util.*;
public class Chapter6_5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i< N; i++){
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);

        int check = -1;
        for(int a : arr){
            if(check == a){
                System.out.println("D");
                return;
            }
            check = a;
        }
        System.out.println("U");
    }
}
