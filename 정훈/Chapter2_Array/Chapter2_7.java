package CodingTest_Study.정훈.Chapter2_Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Chapter2_7 {
    public static void main(String[] args) throws Exception{
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int answer = 0;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] == 1) {
                cnt++;
            }else if(arr[i] == 0){
                cnt = 0;
            }
            answer += cnt;
        }
        System.out.println(answer);
    }
}
