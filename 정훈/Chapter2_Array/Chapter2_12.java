package CodingTest_Study.정훈.Chapter2_Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Chapter2_12 {
    static int n,m;
    static int[][] arr;
    static int answer;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int cnt = 0;
                for (int k = 0; k < m; k++) {
                    int ni =0;
                    int nj = 0;
                    for (int l = 0; l < n; l++) {
                        if(arr[k][l] == i) ni = l;
                        if(arr[k][l] == j) nj = l;
                    }
                    if(ni<nj) cnt++;
                }
                if(cnt == m){
                    answer++;
                }
            }
        }
        System.out.println(answer);

    }
}
