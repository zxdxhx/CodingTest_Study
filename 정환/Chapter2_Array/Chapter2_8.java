package CodingTest_Study.정환.Chapter2_Array;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Chapter2_8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        int[] score = new int[n];
        for(int i=0; i<n; i++){
        int k = sc.nextInt();
        score[i] = k;
        list.add(k);
        }

        Collections.sort(list, Collections.reverseOrder());

        for(int i=0; i<score.length; i++){
            int s = list.indexOf(score[i]);
            System.out.print(s+1 + " ");
        }

    }
}
