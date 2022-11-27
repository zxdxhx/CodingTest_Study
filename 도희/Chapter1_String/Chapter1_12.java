package CodingTest_Study.도희.Chapter1_String;

import java.util.Scanner;

public class Chapter1_12 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.nextLine();
        String str = scan.nextLine();

        String bi = str.replaceAll("#","1");
        bi = bi.replaceAll("\\*","0");
        String answer = "";

        String temp = "";
        for(int i = 1; i<=str.length(); i++){
            temp += bi.charAt(i-1);
            if(i%7==0){
                answer += (char)Integer.parseInt(temp,2);
                temp = "";
            }
        }
        System.out.println(answer);

    }
}
