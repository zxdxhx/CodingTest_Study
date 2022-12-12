package CodingTest_Study.정훈.Chapter1_String;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Chapter1_6 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            String temp = String.valueOf(str.charAt(i));
            if(!answer.contains(temp)){
                answer += temp;
            }
        }

        System.out.println(answer);
    }
}
