package CodingTest_Study.정훈.Chapter1_String.Chapter1_String;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Chapter1_2 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            if (temp-'A'>=0 && temp-'A'<26) {
                sb.append((char)(temp+32));
            }else if(temp-'a'>=0 && temp-'a'<26) {
                sb.append((char)(temp-32));
            }
        }
        answer = sb.toString();
        System.out.println(answer);
    }
}
