package CodingTest_Study.정환.Chapter2_Array;

import java.util.Scanner;

public class Chapter2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = 0;
        int result = 0;
        for(int i=0; i<n; i++){
            int k = sc.nextInt();
            if(k > temp){
                temp = k;
                result ++;
            }
        }
        System.out.println(result);
    }
}
