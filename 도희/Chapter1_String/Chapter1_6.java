package CodingTest_Study.도희.Chapter1_String;

import java.util.*;

public class Chapter1_6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        boolean[] arr = new boolean[65];
        Arrays.fill(arr, false);

        for(int i = 0; i< str.length(); i++){
            if(arr[str.charAt(i)-'A'] == true){
                continue;
            }
            arr[str.charAt(i)-'A'] = true;
            System.out.print(str.charAt(i));
        }
    }
}
