package CodingTest_Study.정훈.Chapter5_Stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Chapter5_1 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            if(temp == '(') {
                stack.push(str.charAt(i));
            }else {
                if(stack.isEmpty()) {
                    System.out.print("NO");
                    System.exit(0);
                }
                stack.pop();
            }
        }
        if(!stack.isEmpty()) {
            System.out.print("NO");
        }else {
            System.out.print("YES");
        }
    }
}
