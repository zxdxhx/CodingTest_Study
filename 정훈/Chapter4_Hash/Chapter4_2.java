package CodingTest_Study.정훈.Chapter4_Hash;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Chapter4_2 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        int[] cnta = new int[26];
        int[] cnta2 = new int[26];
        int[] cntb =new int[26];
        int[] cntb2 = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            int alpha = str1.charAt(i);
            //65~ 90 대문자
            if(alpha>=65 && alpha<=90) {
                cnta[alpha-'A']++;
            }
            //97~ 122 소문자
            else if(alpha>=97 && alpha<=122) {
                cnta2[alpha-'a']++;
            }
        }
        for (int i = 0; i < str2.length(); i++) {
            int alpha = str2.charAt(i);
            //65~ 90 대문자
            if(alpha>=65 && alpha<=90) {
                cntb[alpha-'A']++;
            }
            //97~ 122 소문자
            else if(alpha>=97 && alpha<=122) {
                cntb2[alpha-'a']++;
            }
        }
        if(Arrays.equals(cnta, cntb) && Arrays.equals(cnta2, cntb2)) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }
}
