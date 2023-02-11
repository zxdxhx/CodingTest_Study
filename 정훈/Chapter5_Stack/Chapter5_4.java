package CodingTest_Study.정훈.Chapter5_Stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Chapter5_4 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            //숫자이면
            if(str.charAt(i)-'0' >= 0 && str.charAt(i)-'0'<=9) {
                stack.push(str.charAt(i)-'0');
            }//기호면
            else {
                char temp = str.charAt(i);
                int num1 = stack.pop();
                int num2 = stack.pop();
                if(temp == '+') stack.push(num2 + num1);
                else if(temp == '-') stack.push(num2 - num1);
                else if(temp == '*') stack.push(num2 * num1);
                else if(temp == '/') stack.push(num2 / num1);
            }
        }
        int result = 0;
        result = stack.peek();
        System.out.println(result);


    }
}
