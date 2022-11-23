package CodingTest_Study.정환.Chapter1_String;

import java.util.Scanner;

public class Chapter1_10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String n = sc.next();
        String t = sc.next();
        int[] result = new int[n.length()];
        for(int i=0; i<n.length(); i++){
            char c = n.charAt(i);
            int rightNum = 0;
            boolean rightNumCheck = false;
            int leftNum = 0;
            boolean leftNumCheck = false;
            for(int j=i; j<n.length(); j++){

                char now = n.charAt(j);
                if(now == t.charAt(0)){
                    rightNumCheck = true;
                    break;
                }
                else{
                    rightNum++;
                }
            }
            for(int j=i; j>=0; j--){
                char now = n.charAt(j);
                if(now == t.charAt(0)){
                    leftNumCheck = true;
                    break;
                }
                else{
                    leftNum++;
                }
            }
            if(!rightNumCheck){
                rightNum = 9999;
            }
            if(!leftNumCheck){
                leftNum = 9999;
            }
            result[i] = Math.min(leftNum, rightNum);
        }

        for(int i : result){
            System.out.print(i + " ");
        }

    }
}
