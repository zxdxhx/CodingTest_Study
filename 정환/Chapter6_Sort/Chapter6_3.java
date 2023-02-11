package CodingTest_Study.정환.Chapter6_Sort;

import java.util.Scanner;

public class Chapter6_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];

        for(int i=0; i<n; i++)
            array[i] = sc.nextInt();

        for(int i=0; i<n-1; i++){
            int key = i+1;
            for(int j=i; j>=0; j--){
                if(array[key] < array[j]){
                    int temp = array[j];
                    array[j] = array[key];
                    array[key] = temp;
                    key = j;
                }
            }
        }

        for(int i : array)
            System.out.print(i + " ");
    }
}
