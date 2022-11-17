package CodingTest_Study.정환.Chapter1_String;

import java.util.Scanner;
//강의 풀이법 살짝 참고
public class Chapter1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        String spe = "!@#$%^&*()";
        char[] c = word.toCharArray();
        int start = 0;
        int end = word.length()-1;
        while(start<end){
            if(spe.contains(String.valueOf(c[start]))){
                start++;
            }
            else if(spe.contains(String.valueOf(c[end]))){
                end--;
            }
            else{
                char t = c[start];
                c[start] = c[end];
                c[end] = t;
                start++;
                end--;
            }

        }

        System.out.println(String.valueOf(c));
    }
}
