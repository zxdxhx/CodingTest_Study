package CodingTest_Study.정훈.Chapter5_Stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Chapter5_8 {
    static class Pair  {
        int n;
        int num;
        public Pair(int n, int num){
            this.n = n;
            this.num = num;
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Queue<Pair> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            q.offer(new Pair(i, arr[i]));
        }
        int answer = 0;
        while(!q.isEmpty()){
            Pair temp = q.poll();
            for(Pair p : q) {
                if(p.num > temp.num){
                    q.offer(temp);
                    temp = null;
                    break;
                }
            }
            if(temp != null) {
                answer++;
                if(temp.n == m) {
                    System.out.println(answer);
                    System.exit(0);
                }
            }
        }
        System.out.println(answer);
    }
}
