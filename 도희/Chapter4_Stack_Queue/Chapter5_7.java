package CodingTest_Study.도희.Chapter4_Stack_Queue;

import java.util.*;

public class Chapter5_7 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String str2 = scan.nextLine();

        Queue<Character> queue  = new LinkedList<>();

        for(int i = 0 ; i< str.length(); i++){
            queue.offer(str.charAt(i));
        }

        int i = 0;
        while(queue.size()!=0){
            if(str2.charAt(i)==queue.peek()) {
                queue.poll();
            }
            if(i == str2.length()-1){
                System.out.println("NO");
                return;
            }
            i++;
        }
        System.out.println("YES");

    }
}
