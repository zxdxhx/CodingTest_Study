package CodingTest_Study.도희.Chapter1_String;

import java.util.*;

public class Chapter1_11 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String answer = "";

        char ch = str.charAt(0);
        int count = 1;
        for(int i = 1; i< str.length(); i++){
            if(str.charAt(i)==ch){
                count++;
            }
            else {
                answer += ch;
                if (count > 1) {
                    answer += count;
                }
                ch = str.charAt(i);
                count = 1;
            }
        }
        answer += str.charAt(str.length()-1);
        if(count>1) {
            answer += count;
        }
        System.out.println(answer);
    }
}
