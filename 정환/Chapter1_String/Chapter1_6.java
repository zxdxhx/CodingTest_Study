package CodingTest_Study.정환.Chapter1_String;


import java.util.Scanner;


public class Chapter1_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        String result = "";
        for(char c : word.toCharArray()){
            if(!result.contains(String.valueOf(c))){
                result = result + c;
            }
        }

        System.out.println(result);
    }
}
