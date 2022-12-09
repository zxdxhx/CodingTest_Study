package CodingTest_Study.도희.Chapter2_Array;

import sun.security.util.math.IntegerModuloP;

import java.util.*;

public class Chapter2_6 {
    static int num;
    public static boolean check(int n){
        if(n == 0 || n == 1) return false;
        for(int j = 2; j<n; j++) {
            if (n % j == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        scan.nextLine();
        String[] arr = new String[num];
        String str = scan.nextLine();
        arr = str.split("\\s");


        String answer = "";
        for(int i = 0; i< num; i++) {
            char[] cArr = arr[i].toCharArray();
            for(int j = 0; j<cArr.length/2; j++) {
                char temp = cArr[cArr.length - j - 1];
                cArr[cArr.length - j - 1] = cArr[j];
                cArr[j] = temp;
            }
            String cStr = new String(cArr);
            if(check( Integer.parseInt(cStr))){
                answer += Integer.parseInt(cStr) + " ";
            }
        }
        System.out.println(answer);

    }
}
