package CodingTest_Study.정환.Chapter2_Array;

import java.util.Scanner;

public class Chapter2_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        boolean[][] check = new boolean[n+1][n+1];
        boolean[][] check2 = new boolean[n+1][n+1];
        for(int i=0; i<check2.length; i++){
            for(int j=0; j<check2.length; j++){
                check2[i][j] = true;
            }
        }
        int[][] array = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                array[i][j] = sc.nextInt();
            }
        }
  for(int k = 1; k<=n; k++) {
          for (int i = 0; i < array.length; i++) {
              for (int j = 0; j < array[i].length; j++) {
                    if(array[i][j] == k){
                        for(int t = j; t>=0; t--){
                            check[k][array[i][t]] = false;
                            check2[k][array[i][t]] = false;
                        }
                        for(int p = j+1; p<array[i].length; p++){
                            if(check2[k][array[i][p]]!=false) {
                                check[k][array[i][p]] = true;
                            }
                        }
                        break;
                    }
              }
          }
      }
    int count = 0;
        for(int i=0; i<check.length; i++){
            for(int j=0; j<check[i].length; j++){
                if(check[i][j] ==true){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
