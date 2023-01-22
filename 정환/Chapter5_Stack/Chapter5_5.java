package CodingTest_Study.정환.Chapter5_Stack;

import java.util.Scanner;
import java.util.Stack;

public class Chapter5_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String pipe = sc.next();
        Stack<Character> stack = new Stack<>();
        Stack<Character> enter = new Stack<>();
        int result = 0;
        int left = 0;
        int right = 0;
        for(int i=0; i<pipe.length(); i++){
            char c = pipe.charAt(i);

            if(c == '('){
                stack.add('(');
                enter.add('(');
            }
            else if(enter.peek()=='('&&c==')'){
                stack.pop();
                result += stack.size();

                enter.add(')');
            }
            else if(enter.peek()==')'&&c==')'){
                result += 1;

                stack.pop();
                enter.add(')');
            }
        }

        System.out.println(result);
    }
}
