package CodingTest_Study.정환.Chapter2_Array;

import java.util.Scanner;

public class Chapter2_4 {
    static int fibo(int n) {

        if(n == 1){
            a[n] = 1;
            return 1;
        }
        else if(n == 2){
            a[n] = 1;
            return 1;
        }
        else {
            if(a[n] > 0){
                return a[n];
            }
            a[n] = fibo(n-1)+fibo(n-2);
            return a[n];
        }
    }

    static int[] a;

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        a = new int[n+1];
        fibo(n);

        for(int i=1; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }


}
