package CodingTest_Study.정환.Chapter3_Two;

import java.util.Scanner;

public class Chapter3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = 0;
        boolean[] check  = new boolean[n];
        for(int i=1; i<=n; i++){
            int sum = 0;
            int count = 0;
            for(int j=i; j<n; j++){
                sum += j;
                count++;
                if(sum == n){
                    if(check[count]==false){
                        result++;
                        check[count] = true;
                    }
                }else if(sum > n){
                    break;
                }
            }
        }
        System.out.println(result);
    }
}
