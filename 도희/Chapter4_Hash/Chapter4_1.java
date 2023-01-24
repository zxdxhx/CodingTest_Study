package CodingTest_Study.도희.Chapter4_Hash;

import java.util.*;

public class Chapter4_1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        scan.nextLine();
        String input = scan.nextLine();

        int[] arr = new int[30];
        Arrays.fill(arr,0);

        for(int i =0 ; i<num; i++){
            arr[input.charAt(i)-'A']++;
        }
        int max = 0;
        char maxIndex=' ';
        for(int i = 0; i<arr.length; i++){
            if(max<arr[i]){
                max = arr[i];
                maxIndex = (char)(i+'A');
            }
        }
        System.out.println(maxIndex);
    }
}
