package CodingTest_Study.도희.Chapter1_String;

import java.util.Scanner;
public class Chapter1_8 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        str = str.toUpperCase();

        String str2 = "";
        for(int i = 0; i< str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'X') {
                str2 += str.charAt(i);
            }
        }
        String flag = "YES";
        for(int i = 0; i< str2.length()/2; i++){
//            System.out.print(str2.charAt(i) + " ");
//            System.out.println(str2.charAt(str2.length()-i-1));
            if(str2.charAt(i) != str2.charAt(str2.length()-i-1)){
                flag = "NO";
                break;
            }
        }
        System.out.println(flag);
    }
}
