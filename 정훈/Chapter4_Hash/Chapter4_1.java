package CodingTest_Study.정훈.Chapter4_Hash;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Chapter4_1 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int[] cnt = new int[5];
        for (int i = 0; i < str.length(); i++) {
            int alpha = str.charAt(i)-'A';
            cnt[alpha]++;
        }
        int max = 0;
        int answer = 0;
        for (int i = 0; i < 5; i++) {
            if(max < cnt[i]){
                max = cnt[i];
                answer = i;
            }
        }
        if(answer == 0) System.out.println("A");
        else if (answer == 1) {
            System.out.println("B");
        } else if (answer == 2) {
            System.out.println("C");
        } else if (answer == 3) {
            System.out.println("D");
        } else if (answer == 4) {
            System.out.println("E");
        }
    }
}
