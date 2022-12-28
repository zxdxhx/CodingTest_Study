package CodingTest_Study.도희.Chapter2_Array;

import java.util.*;
//시간초과로 강의
public class Chapter2_5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int cnt = 0;
        int[] ch = new int[n+1];

        for(int i=2; i<=n; i++){
            if(ch[i]==0){
                cnt++;
                for(int j=i; j<=n; j=j+i)
                    ch[j]=1;
            }
        }
        System.out.println(cnt);
    }
}
/*
타임에러
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int answer = 0;

        for(int i= 2; i<= num; i++){
            int count = 0;
            for(int j = 1; j<= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                answer++;
            }
        }
        System.out.println(answer);
* */