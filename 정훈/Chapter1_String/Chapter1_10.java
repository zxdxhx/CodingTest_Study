package CodingTest_Study.정훈.Chapter1_String;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Chapter1_10 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = st.nextToken();
        char s = st.nextToken().charAt(0);

        int[] answer = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            int cnt = 0;
            int bcnt = 0;
            if(s == str.charAt(i)) continue;

            //오른쪽 확인
            for (int j = i; j <str.length() ; j++) {
                char temp = str.charAt(j);
                if(temp == s){
                   break;
                }
                cnt++;
            }
            //왼쪽 확인
            for (int j = i; j >=0 ; j--) {
                char temp = str.charAt(j);
                if(temp == s){
                    break;
                }
                bcnt++;
            }
//            System.out.println("cnt : " + cnt);
//            System.out.println("bcnt : " + bcnt);
            if(i==str.length()-1) answer[i] = bcnt;
            else if(i==0) answer[i] = cnt;
            else {
                cnt = Math.min(cnt,bcnt);
                answer[i] = cnt;
            }
        }
        for (int a: answer
             ) {
            System.out.print(a + " ");
        }
    }
}
