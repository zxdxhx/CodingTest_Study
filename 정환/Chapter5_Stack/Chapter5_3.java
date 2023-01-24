package CodingTest_Study.정환.Chapter5_Stack;

import java.util.Scanner;
import java.util.Stack;

public class Chapter5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = sc.nextInt();
            }
        }
        int result = 0;
        int m = sc.nextInt();
        for(int i=0; i<m; i++){
            int t = sc.nextInt();
            int temp = 0;
            for(int j=0; j<n; j++){
                if(board[j][t-1]!=0){
                    temp = board[j][t-1];
                    board[j][t-1] = 0;
                    break;
                }
            }
            if(stack.isEmpty()){
                stack.add(temp);
            }
            else{
                if(stack.peek() == temp){
                    stack.pop();
                    result += 2;
                }else{
                    stack.add(temp);
                }
            }

        }

        System.out.println(result);
    }
}
