package CodingTest_Study.정환.Chapter6_Sort;


import java.util.Arrays;
import java.util.Scanner;

public class Chapter6_8 {
    static int result = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] array = new int[n];

        for(int i=0; i<n; i++){
            array[i] = sc.nextInt();
        }

        Arrays.sort(array);

        BinarySearch(array, 0, array.length-1, m);
        System.out.println(result+1);


    }

    static void BinarySearch(int[] array, int start, int end, int point){
        int middle = (start + end)/2;
        if(array[middle] == point){
            result = middle;
        }
        else if(array[middle] > point){
            end = middle;
            BinarySearch(array, start, end, point);
        }
        else{
            start = middle;
            BinarySearch(array, start, end, point);
        }
    }
}
