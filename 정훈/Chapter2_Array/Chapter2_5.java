package CodingTest_Study.정훈.Chapter2_Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Chapter2_5 {
    public static void main(String[] args) throws Exception{
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[] prime = new boolean[n+1];
        prime[0] = true;
        prime[1] = true;
        int answer = 0;
        for (int i = 2; i*i <= n; i++) {
            if(!prime[i]){
                for (int j = i*i; j <= n; j+=i) {
                    prime[j] = true;
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            if(!prime[i]) answer++;
        }
        System.out.println(answer);
    }
}
