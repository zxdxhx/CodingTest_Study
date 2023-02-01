package CodingTest_Study.정환.Chapter6_Sort;

import java.util.Scanner;

public class Chapter6_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i=0; i<n; i++){
            array[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        for(int i : array)
            System.out.print(i + " ");
    }
}
