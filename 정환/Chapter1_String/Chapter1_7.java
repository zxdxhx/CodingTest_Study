package CodingTest_Study.정환.Chapter1_String;

import java.util.Scanner;

public class Chapter1_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        boolean check = true;
        for(int i=0; i<word.length()/2; i++){
            String f = String.valueOf(word.charAt(i));
            String b = String.valueOf(word.charAt(word.length()-1-i));
            if(f.toLowerCase().equals(b.toLowerCase())){
                check = true;
            }
            else{
                check = false;
                break;
            }
        }

        if(check == true){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
