package CodingTest_Study.도희.Chapter6_Sort;

import java.util.*;

public class Chapter6_8 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int[] arr = new int[N+1];

        for(int i = 1; i <= N; i++){
            arr[i] = scan.nextInt();
        }

        Arrays.sort(arr);

        int index = N+1/2;
        boolean flag = true;
        while(flag){
            if(arr[index]>M){
                index = index/2;
            }else if(arr[index]<M){
                index = index+1;
            }else{
                break;
            }
        }

        System.out.println(index);

    }
}
