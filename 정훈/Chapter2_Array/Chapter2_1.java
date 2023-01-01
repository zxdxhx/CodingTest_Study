package CodingTest_Study.정훈.Chapter2_Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Chapter2_1 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n =Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }//입력
        StringBuilder sb = new StringBuilder();
        sb.append(arr[0]+ " ");
        for (int i = 0; i < n-1; i++) {
            if(arr[i] < arr[i+1]){
                sb.append(arr[i+1]+ " ");
            }
        }
        System.out.println(sb.toString());
    }

}
