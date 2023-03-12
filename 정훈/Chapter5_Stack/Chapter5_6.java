package CodingTest_Study.정훈.Chapter5_Stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Chapter5_6 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int answer = 0;
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            q.offer(i);
        }
        while (!q.isEmpty()){
            for (int i = 0; i < K-1; i++) {
                q.offer(q.poll());
            }
            q.poll();
            if(q.size() == 1) {
                answer = q.poll();
            }
        }
        System.out.println(answer);


    }
}
