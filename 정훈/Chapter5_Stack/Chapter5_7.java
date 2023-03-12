package CodingTest_Study.정훈.Chapter5_Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Chapter5_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String check = br.readLine();
        String str = br.readLine();
        Stack<Character> stack = new Stack<>();
        for (int i = check.length()-1; i >= 0; i--) {
            stack.push(check.charAt(i));
        }
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            if(!stack.isEmpty()){

                if(temp == stack.peek()){
                    stack.pop();
                }
            }
        }
        if(!stack.isEmpty()){
            System.out.println("NO");
        }else {
            System.out.println("YES");
        }

    }
}
