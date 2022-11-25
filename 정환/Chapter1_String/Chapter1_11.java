package CodingTest_Study.정환.Chapter1_String;

import java.util.Scanner;

public class Chapter1_11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        //KKHSSSSSSSE
        String result = "";
        for(int i=0; i<word.length(); i++){
            char st = word.charAt(i);
            int num = 1;
            result = result + st;
            for(int j=i+1; j<word.length(); j++){
                if(st == word.charAt(j)&&j == word.length()-1){
                    if(st == word.charAt(j)){
                        num++;
                    }
                    if(num != 1){
                        result = result+num;
                        i = word.length();
                        break;
                    }
                }
                if(st == word.charAt(j)){
                    num++;
                }
                else{
                    i = j-1;
                    if(num != 1){
                        result = result+num;
                    }
                    break;
                }
            }
        }

        System.out.println(result);

    }
}
