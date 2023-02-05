package CodingTest_Study.도희.Chapter4_Hash;

import java.util.*;

public class Chapter4_4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();

        int[] arr1 = new int[60];
        int[] arr2 = new int[60];
        for(int i = 0; i< str2.length(); i++){
            arr2[str2.charAt(i)-'A']++;
        }

        int start = 0, end = 0, count = 0;
        int answer = 0;
        while(end<str1.length()){
            arr1[str1.charAt(end++) - 'A']++;
            count++;
            if(count == str2.length()){
                if(Arrays.equals(arr1,arr2)){
                    answer++;
                }
                start++; end = start;
                count = 0;
                arr1 = new int[60];
            }
        }
        System.out.println(answer);
    }
}
