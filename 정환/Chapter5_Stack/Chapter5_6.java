package CodingTest_Study.정환.Chapter5_Stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Chapter5_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();

        for(int i=1; i<=n; i++){
            queue.add(i);
        }
        while(!(queue.size()==1)){

            for(int i=0; i<k-1; i++){
                int t = queue.poll();
                queue.add(t);
            }
            queue.poll();
        }

        System.out.println(queue.poll());

    }
}
