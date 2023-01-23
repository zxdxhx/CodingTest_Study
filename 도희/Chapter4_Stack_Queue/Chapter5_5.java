
package CodingTest_Study.도희.Chapter4_Stack_Queue;

//강의
import java.util.*;

public class Chapter5_5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        Stack<Character> stack = new Stack<>();
        int answer = 0;

        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == '(') stack.push('(');
            else{
                stack.pop();
                if(str.charAt(i-1)=='(') { //레이저인 경우
                    answer += stack.size();
                }else
                    answer++; //막대기가 끝나면서 마지막 조각이 생기기떄문문
           }
        }

    }
}