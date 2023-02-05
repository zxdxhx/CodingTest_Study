package CodingTest_Study.도희.Chapter4_Stack_Queue;

import java.util.*;

public class Chapter5_4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i<str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                stack.push(str.charAt(i) - '0');
            }else{
                int num2 = stack.pop();
                int num1 = stack.pop();
                int ans = 0;
                if(str.charAt(i) == '+'){
                    ans = num1+num2;
                }else if(str.charAt(i) == '-'){
                    ans = num1-num2;
                }else if(str.charAt(i) == '*'){
                    ans = num1*num2;
                }else if(str.charAt(i) == '/'){
                    ans = num1/num2;
                }
                stack.push(ans);
            }
        }
        System.out.println(stack.pop());
    }
}
