package CodingTest_Study.정환.Chapter1_String;

import java.util.Scanner;

public class Chapter1_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<N; i++){
            String word = sc.nextLine();
            String result = "";
            for(Character c : word.toCharArray()){
                result = c + result;
            }
            System.out.println(result);
        }
    }
}
