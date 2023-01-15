package CodingTest_Study.도희.Chapter4_Hash;

import java.util.Scanner;

public class Chapter4_2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String str2 = scan.nextLine();

        int[] arr = new int[60];
        int[] arr2 = new int[60];
        for(int i = 0; i< str.length(); i++){
            arr[str.charAt(i)-'A']++;
            arr2[str2.charAt(i)-'A']++;
        }

        for(int i = 0; i<arr.length; i++){
            if(arr[i]!=arr2[i]){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
