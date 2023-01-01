package CodingTest_Study.정훈.Chapter2_Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Chapter2_2 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }//입력
        int max = arr[0];
        int answer = 1;
        for (int i = 1; i < n; i++) {
            if(arr[i] > max) {
                max = arr[i];
                answer++;
            }
        }
        System.out.println(answer);
    }
}
