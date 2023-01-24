package CodingTest_Study.정환.Chapter5_Stack;

import java.util.Scanner;
import java.util.Stack;

public class Chapter5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(stack.isEmpty()){
                if(c == '('){
                    stack.add(c);
                }
                else{
                    System.out.println("NO");
                    return;
                }
            }else {
                if (c == '(') {
                    stack.add(c);
                } else {
                    if (stack.peek() == '(') {
                        stack.pop();
                    } else {
                        System.out.println("NO");
                        return;
                    }
                }
            }
        }
        if(stack.isEmpty()){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
