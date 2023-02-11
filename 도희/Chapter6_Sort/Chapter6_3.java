package CodingTest_Study.도희.Chapter6_Sort;
//강의

import java.util.Scanner;

public class Chapter6_3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i< N; i++){
            arr[i] = scan.nextInt();
        }

        for(int i=1; i<N; i++){
            int tmp=arr[i], j;
            for(j=i-1; j>=0; j--){
                if(arr[j]>tmp) arr[j+1]=arr[j];
                else break;
            }
            arr[j+1]=tmp;
        }

        for(int i= 0; i< N; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
