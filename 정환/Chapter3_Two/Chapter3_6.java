package CodingTest_Study.정환.Chapter3_Two;

import java.util.Scanner;

public class Chapter3_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] array = new int[n];
        for(int i=0; i<n; i++){
            array[i] = sc.nextInt();
        }
        int result = 0;
        for(int i=0; i<n; i++){
            int rek = k;
            int count = 0;
            for(int j=i; j<n; j++){
                if(array[j]==1){
                    count++;

                }else if(rek>0&&array[j]==0){
                    count++;
                    rek--;
                }
                else{
                    break;
                }
            }
            result = Math.max(result, count);
        }
        System.out.println(result);
    }
}
