package CodingTest_Study.도희.Chapter3_TwoPointers;

import java.util.*;

public class Chapter3_4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int[] arr = new int[N];
        for(int i =0; i<N; i++){
            arr[i] = scan.nextInt();
        }

        int p1 = 0; int p2 = 0;
        int answer = 0;
        int total = 0;
        while(p2<N){
            if(total > M){
                total -= arr[p1++];
            }else if(total< M){
                total += arr[p2++];
            }else{
                total -= arr[p1++];
                answer++;
            }
        }
        while(p1<N){
            if(total == M){
                total -= arr[p1];
                answer++;
            }
            p1++;
        }
        System.out.println(answer);
    }
}
