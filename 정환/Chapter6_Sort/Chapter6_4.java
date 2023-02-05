package CodingTest_Study.정환.Chapter6_Sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Chapter6_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int n = sc.nextInt();
        int[] array = new int[s];

        for(int i=0; i<n; i++){
            int key = sc.nextInt();

            boolean check = false;
            for(int j=0; j<s; j++){


                if(array[j] == 0){
                    array[j] = key;
                    check = true;
                    break;
                }
                else if(array[j] == key){
                    for(int k=j; k>0; k--){
                        array[k] = array[k-1];
                    }
                    array[0] = key;
                    check = true;
                    break;

                }
            }
            if(check == false) {
                for (int k = s - 1; k > 0; k--) {
                    array[k] = array[k - 1];
                }
                array[0] = key;
            }

        }

        for(int i : array)
            System.out.print(i + " ");

    }
}
