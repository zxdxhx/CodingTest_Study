package CodingTest_Study.정훈.Chapter2_Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Chapter2_4 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] fibo = new int[n];
        fibo[0] = 1;
        fibo[1] = 1;
        fibo[2] = 2;
        for (int i = 3; i < n; i++) {
            fibo[i] = fibo[i-1] + fibo[i-2];
        }
        for (int f :
                fibo) {
            System.out.print(f + " ");
        }
    }
}
