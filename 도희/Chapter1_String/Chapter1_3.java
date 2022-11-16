package CodingTest_Study.도희.Chapter1_String;
import java.util.*;

public class Chapter1_3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        String arr[] = str.split("\\s");

        int max = 0;
        int maxInt = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i].length() > max){
                 maxInt = i;
                 max = arr[i].length();
            }else if(arr[i].length() == max){
                continue;
            }
        }
        System.out.println(arr[maxInt]);
    }
}
