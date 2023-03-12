package CodingTest_Study.정훈.Chapter6_Sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Chapter7_8 {
    static int s, e;
    static int[] dx = {-1, 1, 5};
    static boolean[] check;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        s = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());
        //앞으로 1, 5 | 뒤로 1
        int answer = bfs(s, e);
        System.out.println(answer);
    }

    public static int bfs(int start, int end) {
        check = new boolean[10001];
        Queue<Integer> q = new LinkedList<>();
        q.offer(s);
        int level = 0 ;
        while(!q.isEmpty()){
            int len = q.size();
            for (int i = 0; i < len; i++) {
                int x = q.poll();
                for (int d = 0; d < 3; d++) {
                    int nx = x + dx[d];
                    if(nx == e) {
                        return level + 1;
                    }
                    if(nx >= 1 && nx <= 10000 && check[nx] == false){
                        check[nx] = true;
                        q.offer(nx);
                    }
                }
            }
            level++;
        }
        return 0;
    }
}
