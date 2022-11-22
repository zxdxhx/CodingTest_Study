package CodingTest_Study.정환.Chapter1_String;

import java.util.Scanner;

public class Chapter1_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String number = "0123456789";

        String answer = "";
        for(char c : word.toCharArray()){
            if(number.contains(String.valueOf(c))){
                answer = answer + String.valueOf(c);
            }
        }

        System.out.println(Integer.valueOf(answer));
        }
}
