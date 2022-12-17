package CodingTest_Study.정훈.Chapter1_String.Chapter1_String;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Chapter1_11 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        str = str + " ";
        int cnt = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length()-1; i++) {
            if(str.charAt(i) == str.charAt(i+1)) cnt++;
            else {
                sb.append(str.charAt(i));
                if(cnt>1) sb.append(cnt);
                cnt = 1;
            }
        }
        System.out.println(sb.toString());
    }
}
