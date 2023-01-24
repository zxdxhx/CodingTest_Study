package CodingTest_Study.정훈.Chapter5_Stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Chapter5_3 {
    static int n,m;
    static int[][] map;
    static int[] moves;
    static int answer = 0;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        m = Integer.parseInt(br.readLine());
        moves = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            moves[i] = Integer.parseInt(st.nextToken());
        }

        Stack<Integer> stack = new Stack<>();
        for(int m : moves) {
            for (int i = 0; i < n; i++) {
                if(map[i][m-1] != 0) {
                    int temp = map[i][m-1];
                    map[i][m-1] = 0;
                    if(!stack.isEmpty() && temp == stack.peek()){
                        answer+=2;
                        stack.pop();
                    }else {
                        stack.push(temp);
                    }
                    break;
                }
            }
        }
        System.out.println(answer);


    }
}
