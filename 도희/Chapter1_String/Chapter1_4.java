package CodingTest_Study.도희.Chapter1_String;
import java.util.*;

public class Chapter1_4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        scan.nextLine();

        String output  = "";
        for (int i = 0; i< n; i++){
            String str = scan.nextLine();
            for(int j = str.length() - 1; j >= 0; j--){
               output += str.charAt(j);
            }
            output += "\n";
        }
        System.out.println(output);
    }
}
