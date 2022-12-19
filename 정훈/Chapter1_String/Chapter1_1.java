package CodingTest_Study.정훈.Chapter1_String;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Chapter1_1 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String s = br.readLine();
        int answer = 0;
        str = str.toLowerCase();
        s = s.toLowerCase();
        char temp = s.charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if(temp == str.charAt(i)) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}
