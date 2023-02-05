package CodingTest_Study.정환.Chapter3_Two;

import java.util.Scanner;

public class Chapter3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int result = 0;
        for(int i=0; i<array.length; i++){
            int sum = 0;
            for(int j=i; j<array.length; j++){
                sum += array[j];
                if(sum == m){
                    result++;
                }
                if(sum > m){
                    break;
                }
            }
        }
        System.out.println(result);

    }
}
