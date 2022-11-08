package CodingTest_Study.정환.Chapter1_String;

import java.util.Scanner;

public class Chapter1_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for(Character c : word.toCharArray()){

            if(c >= 'A' && c <= 'Z'){
                sb.append(c.toString().toLowerCase());
            }
            else{
                sb.append(c.toString().toUpperCase());
            }

        }

        System.out.println(sb.toString());

    }
}
