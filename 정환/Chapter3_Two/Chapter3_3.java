package CodingTest_Study.정환.Chapter3_Two;

import java.util.Scanner;

public class Chapter3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] array = new int[m];
        for(int i=0; i<m; i++){
            array[i] = sc.nextInt();
        }

        int max = 0;
        for(int i=0; i<k; i++){
            max += array[i];
        }
        int st = 0;
        int rt = k;
        int newmax = max;
        while(rt<m){
            newmax = newmax - array[st] + array[rt];
            max = Math.max(max, newmax);
            st++;
            rt++;
        }
        System.out.println(max);

    }
}
