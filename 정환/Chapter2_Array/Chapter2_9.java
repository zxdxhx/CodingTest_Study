package CodingTest_Study.정환.Chapter2_Array;

import java.util.Scanner;

public class Chapter2_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int array[][] = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                array[i][j] = sc.nextInt();
            }
        }
        int widthCount = 0;
        int heightCount = 0;
        int rightCross = 0;
        int leftCross = 0;
        int max = 0;
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array.length; j++){
                widthCount += array[i][j];
                heightCount += array[j][i];
                rightCross += array[j][j];
                leftCross += array[array.length-1-i][j];
            }
            max =  Math.max(widthCount, max);
            max = Math.max(heightCount, max);
            max =  Math.max(leftCross, max);
            max = Math.max(rightCross, max);
            heightCount = 0;
            leftCross = 0;
            rightCross = 0;
            widthCount = 0;
        }

        System.out.println(max);

    }
}
