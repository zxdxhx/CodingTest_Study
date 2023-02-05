package CodingTest_Study.도희.Chapter4_Hash;
//시간초과로 강의

import java.util.*;
public class Chapter4_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int k = scan.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();
        }

        int end = 0;
        int start = 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while(end < N){
            map.put(arr[end],map.getOrDefault(arr[end],0)+1);
            end++; count++;
            if(count == k){
                count = 0;
                start++; end = start;
                System.out.print(map.size()+" ");
                map = new HashMap<>();
            }
        }
    }
}
