package CodingTest_Study.정훈.Chapter6_Sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Chapter6_4 {
    static int n, m;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[m];
        int[] cache = new int[n];
        for (int i = 0; i < m; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int x : arr) {
            int pos = -1;
            for (int i = 0; i < n; i++) {
                if(x == cache[i]) pos = i;
            }
            if(pos==-1) {
                for (int i = n-1; i >= 1 ; i--) {
                    cache[i] = cache[i-1];
                }
            }else {
                for (int i = pos; i >= 1; i--) {
                    cache[i] = cache[i-1];
                }
            }
            cache[0] = x;
        }
        for(int c : cache) System.out.print(c + " ");
    }
}
