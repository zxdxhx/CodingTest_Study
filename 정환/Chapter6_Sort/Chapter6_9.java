package CodingTest_Study.정환.Chapter6_Sort;

import java.util.Arrays;
import java.util.Scanner;

public class Chapter6_9 {
    //강의봤습니다.
    static int result = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int array[] = new int[n];

        for(int i=0; i<n; i++){
            array[i] = sc.nextInt();
        }
        Decision(array, m);
        System.out.println(result);

    }

    static void Decision(int[] array, int m){
        int lt = Arrays.stream(array).max().getAsInt();
        int rt = Arrays.stream(array).sum();

        while(lt<=rt){
            int mid = (lt+rt)/2;
            if(check(array, mid)<=m){
                result = mid;
                rt = rt-1;
            }
            else{
                lt = mid+1;
            }
        }
    }

    static int check(int[] array, int temp){
        int sum = 0;
        int count = 1;
        for(int i=0; i<array.length; i++){
            if(sum+array[i] > temp){
                count++;
                sum = array[i];
            }
            else{
                sum =  sum + array[i];
            }
        }
        return count;
    }
}
