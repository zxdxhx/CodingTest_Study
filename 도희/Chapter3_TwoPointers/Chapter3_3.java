package CodingTest_Study.도희.Chapter3_TwoPointers;

import java.util.*;

public class Chapter3_3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();

        int arr[] = new int[N];
        for(int i = 0; i<N; i++){
            arr[i] = scan.nextInt();
        }

        int total=0; int max=0;
        for(int i = 0; i<K; i++){
            total += arr[i];
            max += arr[i];
        }
        int p1 = 0; int p2 = K;
        while(p2 <N){
            total -= arr[p1++];
            total += arr[p2++];
            max = Math.max(total, max);
        }
        System.out.println(max);
    }
}
