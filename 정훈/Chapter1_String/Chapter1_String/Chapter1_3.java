package CodingTest_Study.정훈.Chapter1_String.Chapter1_String;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Chapter1_3 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] temp = str.split(" ");
        int check = 0;
        String answer = "";
        for (String t: temp) {
            int tlen = t.length();
            if(check < tlen){
                check = tlen;
                answer = t;
            }
        }
        System.out.println(answer);
    }
}
