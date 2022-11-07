package CodingTest_Study.정환.Chapter1_String;

import java.util.Scanner;

public class Chapter1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String upper = sc.nextLine().toUpperCase();
        String lower = upper.toLowerCase();
        char up = upper.charAt(0);
        char lo = lower.charAt(0);
        int count = 0;
        for(int i=0; i<line.length(); i++){
            char a = line.charAt(i);

            if(a == up || a == lo){
                count ++;
            }

        }
        System.out.println(count);
    }
}
