package CodingTest_Study.도희.Chapter6_Sort;

import java.util.*;
//선택정렬안씀 ..

public class Chapter6_1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i< N; i++){
            arr[i] = scan.nextInt();
        }

        Arrays.sort(arr);

        for(int i= 0; i< N; i++){
            System.out.print(arr[i]+ " ");
        }

    }
}
