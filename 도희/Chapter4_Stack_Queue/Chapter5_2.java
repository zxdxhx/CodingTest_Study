package CodingTest_Study.도희.Chapter4_Stack_Queue;

import java.util.*;

public class Chapter5_2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        Stack<Character> stack  = new Stack<>();

        for(char x : str.toCharArray()){
            if(x!=')')
                stack.push(x);
            else if(x == ')'){
                while(stack.pop() != '(');// 조건문에 한번들어가면 pop..
            }
        }

        for(int i = 0; i <stack.size(); i++){
          System.out.print(stack.get(i));
        }
    }
}
