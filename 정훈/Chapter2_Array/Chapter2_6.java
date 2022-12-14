package CodingTest_Study.정훈.Chapter2_Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Chapter2_6 {
    public static void main(String[] args) throws Exception{
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            String temp = st.nextToken();
            String num = "";
            for (int j = temp.length()-1; j >= 0; j--) {
                num += temp.charAt(j);
            }
            int rnum = Integer.parseInt(num);
            if(isPrime(rnum)) sb.append(rnum + " ");
//            System.out.println(rnum);
        }
        System.out.println(sb.toString());
    }

    private static boolean isPrime(int rnum) {
        if(rnum==1) return false;
        for (int i = 2; i < rnum; i++) {
            if(rnum % i == 0) {
                return false;
            }
        }
        return true;
    }

}
