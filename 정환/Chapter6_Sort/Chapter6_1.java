package CodingTest_Study.정환.Chapter6_Sort;

import java.util.Scanner;

public class Chapter6_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i=0; i<n; i++){
            array[i] = sc.nextInt();
        }

        for(int i = n-1; i>=0; i--){
            int index = 0;
            for(int j=0; j<=i; j++){
                if(array[index] < array[j]){
                    index = j;
                }
            }
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
        for(int i : array){
            System.out.print(i +" ");
        }
    }
}
