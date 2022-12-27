
package CodingTest_Study.도희.Chapter2_Array;

import java.util.*;
public class Chapter2_1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.nextLine();
        int[] arr = new int[num];
        for(int i = 0; i< num; i++){
            arr[i] = scan.nextInt();
        }

        System.out.print(arr[0] + " ");
        for(int i = 1; i < num; i++){
            if(arr[i] > arr[i-1]){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
