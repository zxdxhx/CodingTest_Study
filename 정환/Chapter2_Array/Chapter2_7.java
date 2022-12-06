package CodingTest_Study.정환.Chapter2_Array;

import java.util.Scanner;

public class Chapter2_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k;
        int count = 0;
        int result = 0;
        for(int i=0; i<n; i++){
            k = sc.nextInt();
            if(k == 1){
                count++;
                result += count;
            }
            else{
                count = 0;
            }
        }
        System.out.println(result);


    }
}
