package CodingTest_Study.정훈.Chapter3_Efficiency;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Chapter3_5 {
    public static void main(String[] args) throws  Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int answer = 0;
        int cnt = 2;
        n--;
        while(n > 0) {
            n = n - cnt;
            if(n % cnt++ == 0) answer++;
        }
        System.out.println(answer);
    }
}
