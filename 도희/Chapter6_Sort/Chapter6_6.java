package CodingTest_Study.도희.Chapter6_Sort;

import java.util.*;

public class Chapter6_6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] sort = new int[N+1];
        int[] check = new int[N+1];
        for(int i = 1; i<=N; i++){
            int n = scan.nextInt();
            sort[i] = n;
            check[i]= n;
        }

        Arrays.sort(sort);

        for(int i = 1; i <= N; i++){
            if(sort[i] != check[i]){
                System.out.print(i+" ");
            }
        }

    }
}
