package CodingTest_Study.정환.Chapter5_Stack;

import java.util.Scanner;
import java.util.Stack;

public class Chapter5_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String postfix = sc.next();
        Stack<Integer> stack = new Stack<>();
        int n = 0;
        int m = 0;
        for(int i=0; i<postfix.length(); i++){
            char c = postfix.charAt(i);

            if(c == '+'){
                n = stack.pop();
                m = stack.pop();
                stack.add(n+m);
            }
            else if(c == '*'){
                n = stack.pop();
                m = stack.pop();
                stack.add(n*m);
            }
            else if(c == '-'){
                n = stack.pop();
                m = stack.pop();
                stack.add(m-n);
            }else if(c == '/'){
                n = stack.pop();
                m = stack.pop();
                stack.add(m/n);
            }else{
                stack.add(Integer.valueOf(c-'0'));
            }
        }
        System.out.println(stack.pop());
    }
}
