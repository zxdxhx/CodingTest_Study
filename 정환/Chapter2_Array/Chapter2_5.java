package CodingTest_Study.정환.Chapter2_Array;

import java.util.Scanner;

public class Chapter2_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean check = true;
        int count = 0;
        for(int i=2; i<=n; i++){
            check = true;
            for(int j=2; j<=Math.sqrt(i); j++){
                if(i%j==0){
                    check = false;
                    break;
                }
            }
            if(check == true)
            count++;
        }
        System.out.println(count);
    }
}
