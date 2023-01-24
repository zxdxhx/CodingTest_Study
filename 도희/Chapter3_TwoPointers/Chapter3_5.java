package CodingTest_Study.도희.Chapter3_TwoPointers;

import java.util.*;

public class Chapter3_5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int start = 0;
        int end = 1;
        int total = start+end;
        int count = 0;

        for(int i = 1; i< num; i++){
            if(total < num){
                end++;
                total += end;
            }else if(total > num){
                start++;
                total -= start;
            }else{
                count++;
                start++; end++;
                total = total - start + end;
            }
        }
        System.out.println(count);
    }
}
