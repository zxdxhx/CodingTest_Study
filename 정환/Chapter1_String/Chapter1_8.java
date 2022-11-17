package CodingTest_Study.정환.Chapter1_String;

import java.util.Scanner;

public class Chapter1_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String words = sc.nextLine();
        boolean check = true;
        //found7, time: study; Yduts; emit, 7Dnuof

        words = words.replaceAll("[1-9,!@#$%^&*();:'\",]", "");
        words = words.replaceAll(" ", "");

        for(int i=0; i<words.length()/2; i++){
            String f = String.valueOf(words.charAt(i));
            String b = String.valueOf(words.charAt(words.length()-1-i));

            if(f.toLowerCase().equals(b.toLowerCase())){
                check = true;
            }
            else{
                check = false;
                break;
            }
        }

        if(check)
            System.out.println("YES");
        else
            System.out.println("NO");

    }
}
