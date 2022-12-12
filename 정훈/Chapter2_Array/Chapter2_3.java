package CodingTest_Study.정훈.Chapter2_Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Chapter2_3 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int[] B = new int[n];
        for (int i = 0; i < n; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
//            1<2 2<3 3<1;
            if(A[i] == B[i]) sb.append("D").append("\n");
            else if(A[i] == 1 && B[i] == 3) sb.append("A").append("\n");
            else if(A[i] == 2 && B[i] == 1) sb.append("A").append("\n");
            else if(A[i] == 3 && B[i] == 2) sb.append("A").append("\n");
            else sb.append("B").append("\n");
        }
        System.out.println(sb.toString());

    }
}
