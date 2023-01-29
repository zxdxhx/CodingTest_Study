package CodingTest_Study.정환.Chapter5_Stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Chapter5_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String essential = sc.next();
        String plan = sc.next();

        Queue<Character> check = new LinkedList<>();

        for(int i=0; i<essential.length(); i++){
            check.add(essential.charAt(i));
        }

        for(int i=0; i<plan.length(); i++){
            if(check.isEmpty()){
                break;
            }
            char c = plan.charAt(i);
            char peek = check.peek();
            if(c == peek){
                check.poll();
            }
        }

        if(check.isEmpty()){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }


    }
}
