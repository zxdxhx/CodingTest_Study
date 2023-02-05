package CodingTest_Study.도희.Chapter4_Stack_Queue;
import java.util.*;

public class Chapter5_6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        for(int i = 1; i<= N; i++){
            queue.offer(i);
        }

        int count = 0;
        while(queue.size() >1){
            count++;
            if(count == K){
                queue.poll();
                count = 0;
            }else{
                queue.offer(queue.poll());
            }
        }

        System.out.println(queue.poll());
    }
}
