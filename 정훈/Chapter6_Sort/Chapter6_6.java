package CodingTest_Study.정훈.Chapter6_Sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Chapter6_6 {
    static int n;
    static int[] arr;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] temp = arr.clone();
        Arrays.sort(temp);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if(arr[i] != temp[i]) sb.append(i+1).append(" ");
        }
        System.out.println(sb.toString());
    }
}
