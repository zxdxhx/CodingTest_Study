package CodingTest_Study.정훈.Chapter1_String;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Chapter1_12 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String stemp = str.substring(0,7).replace('#', '1').replace('*','0');
            int num = Integer.parseInt(stemp, 2); // 2진수 -> 10진수
            sb.append((char)num);
            str = str.substring(7);
        }
        System.out.println(sb.toString());
    }
}
