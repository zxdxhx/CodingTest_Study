/*
 5
9 8 7 6 5
5 6 7 8 9
1 2 3 7 8
4 5 3 4 2
6 2 8 4 2
*
왜 답 3인지?
* */
package CodingTest_Study.도희.Chapter2_Array;

import java.util.*;

public class Chapter2_11 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[][] arr = new int[num][5];
        int[] count = new int[num];

        for(int i = 0; i < num; i++){
            for(int j = 0 ; j< 5; j++){
                arr[i][j] = scan.nextInt();
            }
        }
        for(int j = 0 ; j< 5; j++){
            for(int z = 0; z<num; z++){
                for(int i = 0; i < num; i++){
                    if(z==i){
                        continue;
                    }
                    if(arr[z][j]==arr[i][j]){
                        System.out.print("j: " +j +" ");
                        System.out.print("arr z"+z +", arr i"+i);
                        count[z]++;
                        System.out.println();
                    }
                }
            }
        }

        for(int i = 0; i < num; i++){
            System.out.print(count[i]);
        }

        System.out.println();
        int maxIndex = 0;
        int max = 0;
        for(int i = 0; i<num; i++){
            if(max<count[i]){
                max = count[i];
                maxIndex = i;
            }
        }
        System.out.println(maxIndex+1);
    }
}

