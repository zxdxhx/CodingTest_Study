package CodingTest_Study.정훈.Chapter1_String.Chapter1_String;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Chapter1_8 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <str.length(); i++) {
            char temp = str.charAt(i);
            if((temp-'a'>=0 && temp-'a'<26) || (temp-'A'>=0 && temp-'A'<26)) {
                sb.append(temp);
            }

        }
        String temp = sb.toString();
        temp = temp.toLowerCase();
//        System.out.println(temp);
        boolean check = true;
        for (int i = 0; i < temp.length()/2; i++) {
            if(temp.charAt(i) != temp.charAt(temp.length()-i-1)) {
                check = false;
            }
        }
        if(check) System.out.println("YES");
        else System.out.println("NO");

    }
}
