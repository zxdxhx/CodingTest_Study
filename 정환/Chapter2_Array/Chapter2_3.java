package CodingTest_Study.정환.Chapter2_Array;

import java.util.Scanner;

public class Chapter2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n  = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            b[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++){
            if(a[i]-b[i]>1){
                System.out.println("B");
            }
            else if(a[i]-b[i] == 1){
                System.out.println("A");
            }
            else if(b[i]-a[i] > 1){
                System.out.println("A");
            }else if(b[i]-a[i] == 1){
                System.out.println("B");
            }
            else if(a[i]==b[i]){
                System.out.println("D");
            }
        }
    }


}
