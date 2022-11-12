package CodingTest_Study.도희.Chapter1_String;
import java.util.Scanner;

public class Chapter1_1 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        str = str.toUpperCase();
        String w = scan.nextLine();
        w = w.toUpperCase();

        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == w.charAt(0)){
                count++;
            }
        }
        System.out.println(count);
        return ;
    }
}
