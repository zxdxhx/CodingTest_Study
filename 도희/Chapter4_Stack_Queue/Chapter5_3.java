package CodingTest_Study.도희.Chapter4_Stack_Queue;

import java.util.*;

public class Chapter5_3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        int[][] board = new int[N+1][N+1];
        for(int i = 1; i<=N; i++){
            for(int j = 1; j<=N; j++){
                board[i][j] = scan.nextInt();
            }
        }

        int M = scan.nextInt();
        int[] moves = new int[M+1];
        for(int i =1; i<=M; i++){
            moves[i] = scan.nextInt();
        }
        Stack<Integer> stack = new Stack<Integer>();

        int num = 0;
        int count = 0;
        for(int i = 1; i <= M; i++){
            for(int j = 1; j <= N; j++){
                if(board[j][moves[i]] != 0){
                    num = board[j][moves[i]];
                    board[j][moves[i]] = 0;
                    if(!stack.isEmpty() && stack.peek()==num){
                        count+=2;
                        stack.pop();
                    }else{
                        stack.push(num);
                    }
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
