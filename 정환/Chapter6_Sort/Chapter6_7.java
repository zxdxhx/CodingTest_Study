package CodingTest_Study.정환.Chapter6_Sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Chapter6_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] array = new int[n][2];

        for(int i=0; i<n; i++){
            array[i][0] = sc.nextInt();
            array[i][1] = sc.nextInt();
        }

        Arrays.sort(array, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]) {
                    return o1[1] - o2[1];
                }
                else{
                    return o1[0] - o2[0];
                }
            }
        });

        for(int i=0; i<n; i++){
            System.out.println(array[i][0] + " " + array[i][1]);
        }
    }
}
