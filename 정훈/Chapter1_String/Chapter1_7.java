package CodingTest_Study.정훈.Chapter1_String;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Chapter1_7 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        str = str.toLowerCase();
        boolean check = true;
        for (int i = 0; i <str.length()/2; i++) {

            if(str.charAt(i) != str.charAt(str.length()-i-1)) {
                check = false;
            }
        }
        if(check) System.out.println("YES");
        else System.out.println("NO");
    }
}
