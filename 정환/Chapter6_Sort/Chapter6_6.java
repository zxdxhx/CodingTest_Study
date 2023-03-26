package CodingTest_Study.정환.Chapter6_Sort;

import java.util.Arrays;
import java.util.Scanner;

public class Chapter6_6 {
    public static void main(String[] args) {
        //강의로 푸는법 대충 확인함..
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int array[] = new int[n];
        int temp[] = new int[n];
        for(int i=0; i<n; i++){
            int t = sc.nextInt();
            array[i] = t;
            temp[i] = t;
        }
        int chul = 0;
        int friend = 0;

        Arrays.sort(temp);
        boolean check = true;
        for(int i=0; i<n; i++){
            if(array[i] != temp[i] && !check){
                friend =  i+1;
                break;
            }
            if(array[i] != temp[i] && check){
                chul =  i+1;
                check = false;
            }

        }


        System.out.println(chul + " " + friend);

    }
}
