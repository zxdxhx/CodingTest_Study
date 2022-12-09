package CodingTest_Study.정환.Chapter1_String;

import java.util.Scanner;

public class Chapter1_12 {
    public static void main(String[] args) {
        //Integer.parseInt(tep, 2); 2진수가 10진수로 바뀐다.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        String secretWords = sc.nextLine();
        String result = "";
        for(int i=0; i<n; i++){
            String secretWord = secretWords.substring(i*7, (i+1)*7);
            int num = 0;
            for(int j=0; j<secretWord.length(); j++){
                char c = secretWord.charAt(j);
                if(c == '#'){
                    int count = secretWord.length()-1-j;
                    int tempNum = 1;
                    for(int k=0; k<count; k++){
                        tempNum *= 2;
                    }
                    num += tempNum;
                }
            }
            char temp = (char)num;
            result = result + temp;

        }

        System.out.println(result);
    }
}
