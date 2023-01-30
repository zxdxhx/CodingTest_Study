package CodingTest_Study.정환.Chapter5_Stack;

import java.util.Scanner;
import java.util.Stack;

public class Chapter5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Character> stack = new Stack<>();
        String result = "";
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            if(c =='('){
                stack.add('(');
            }
            else if(c ==')'){
                stack.pop();
            }
            else if(stack.isEmpty()){
                result =  result + c;
            }
        }

        System.out.println(result);
    }
}
