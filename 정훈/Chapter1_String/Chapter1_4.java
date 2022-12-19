package CodingTest_Study.정훈.Chapter1_String;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Chapter1_4 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            String str = br.readLine();
            for (int j = str.length()-1; j >= 0 ; j--) {
                sb.append(str.charAt(j));
            }
            System.out.println(sb.toString());

        }
    }
}
