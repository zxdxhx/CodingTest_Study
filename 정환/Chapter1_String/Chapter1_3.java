package CodingTest_Study.정환.Chapter1_String;

import java.util.Scanner;

public class Chapter1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String Sentence = sc.nextLine();

        String[] word = Sentence.split(" ");
        String result = word[0];
        int len = word[0].length();
        for(String w : word){
            if(len < w.length()){
                len = w.length();
                result = w;
            }
        }
        System.out.println(result);

    }
}
