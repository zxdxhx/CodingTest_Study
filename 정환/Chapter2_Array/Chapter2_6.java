package CodingTest_Study.정환.Chapter2_Array;

import java.util.Scanner;

public class Chapter2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            String k = sc.next();
            sosu(reverse(k));
        }
    }
    static int reverse(String k){
        String temp = "";
        for(int i=k.length()-1; i>=0; i--){
            char c = k.charAt(i);
            temp = temp + c;
        }
        return Integer.valueOf(temp);
    }
    static void sosu(int s){
        if(s == 1) return;
        for(int i=2; i<=Math.sqrt(s); i++){
            if(s%i==0){
                return;
            }
        }
        System.out.print(s +" ");
    }
}
