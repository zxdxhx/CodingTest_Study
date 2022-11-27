package CodingTest_Study.도희.Chapter1_String;
//강의

import java.util.*;
public class Chapter1_10 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        char c = scan.nextLine().charAt(0);

        int[] answer = new int[str.length()];
        int p = str.length();

        //왼쪽에 있는 e기준
        for(int i  = 0 ; i < str.length(); i++){
            if(str.charAt(i) == c){
                p = 0;
                answer[i] = p;
            }else{
                p++;
                answer[i] = p;
            }
        }

        //다시 p값 초기화
        p = str.length();
        //오른쪽에있는
        for(int i  = str.length(); i >= 0; i --){
            if(str.charAt(i) == c){
                p = 0;
            }else{
                p++;
                answer[i] = Math.min(answer[i],p);
            }
        }
        for(int x: answer){
            System.out.println(x+" ");
        }
    }
}
