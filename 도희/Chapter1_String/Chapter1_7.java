package CodingTest_Study.도희.Chapter1_String;

import java.util.*;

public class Chapter1_7 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        str = str.toUpperCase();

        String flag = "YES";
        for(int i = 0; i< str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                flag = "NO";
                break;
            }
        }
        System.out.println(flag);
    }
}
