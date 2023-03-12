package CodingTest_Study.정훈.Chapter5_Stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Chapter5_5 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Stack<Character> stack = new Stack<>();
        int answer = 0;
        //() : 레이저
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            if(temp == '(') {
                stack.push(temp);
            }else {
                //하나 빼고 나머지 스택 사이즈를 더한다.
                stack.pop();
                char check = str.charAt(i-1);
                if(check == '(') {
                    answer += stack.size();
                }else {
                    answer += 1;
                }
            }
        }
        System.out.println(answer);



    }
}
