package CodingTest_Study.도희.Chapter6_Sort;
//강의

import java.util.Scanner;

public class Chapter6_2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i< N; i++){
            arr[i] = scan.nextInt();
        }

        for(int i=0; i<N-1; i++){
            for(int j=0; j<N-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }

        for(int i= 0; i< N; i++){
            System.out.print(arr[i]+ " ");
        }


    }
}
