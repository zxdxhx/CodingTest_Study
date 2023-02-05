package CodingTest_Study.도희.Chapter4_Stack_Queue;
//강의
import java.util.*;

public class Chapter5_8 {
    static class Person{
        int id;
        int priority;
        public Person(int id, int priority){
            this.id=id;
            this.priority=priority;
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i<N; i++){
            arr[i] = scan.nextInt();
        }

        int answer = 0;
        Queue<Person> queue = new LinkedList<>();
        for(int i = 0; i<N; i++){
            queue.offer(new Person(i, arr[i]));
        }

        while(queue.size()>1){
            Person temp = queue.poll();
            for(Person x : queue){
                if(x.priority> temp.priority){
                    queue.offer(temp);
                    temp = null;
                    break;
                }
            }
            if(temp!=null){//우선순위가 가장 높다는 말
                answer++;
                if(temp.id == M) {
                    System.out.println(answer);
                    return;
                }
            }
        }
    }
}
