package CodingTest_Study.정훈.Chapter2_Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Chapter2_9 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
        StringTokenizer st;
        for (int i = 0; i <n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            int answer = 0;
            for (int j = 0; j < n; j++) {
                answer += arr[i][j];
            }
            max = Math.max(max, answer);
        }
        for (int i = 0; i < n; i++) {
            int answer = 0;
            for (int j = 0; j < n; j++) {
                answer += arr[j][i];
            }
            max = Math.max(max, answer);
        }
        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==j) answer += arr[i][j];
            }
            max = Math.max(max, answer);
        }
        System.out.println(max);
    }
}
