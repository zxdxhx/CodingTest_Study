package CodingTest_Study.정훈.Chapter1_String;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Chapter1_9 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c-'0' >=0 && c-'0'<10){
                sb.append(c);
            }
        }
        System.out.println(Integer.parseInt(sb.toString()));
    }
}
