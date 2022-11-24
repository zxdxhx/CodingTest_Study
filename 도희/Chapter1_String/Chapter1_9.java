package CodingTest_Study.도희.Chapter1_String;

import java.util.Scanner;

public class Chapter1_9 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        char[] arr = str.toCharArray();
        String answer = "";
        for(int i = 0; i < arr.length; i++){
            if(Character.isDigit(arr[i])){
                answer += arr[i];
            }
        }

        System.out.println(Integer.parseInt(answer));

    }
}
