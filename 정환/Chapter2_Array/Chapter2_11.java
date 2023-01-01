package CodingTest_Study.정환.Chapter2_Array;

import java.util.Scanner;
//        5
//        2 3 1 7 3
//        4 1 9 6 8
//        5 5 2 4 4
//        6 5 2 6 7
//        8 4 2 2 2
public class Chapter2_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] array = new int[n][5];
        int[] count = new int[n];
        for(int i=0; i<n; i++){
            for(int j=0; j<5; j++){
                array[i][j] = sc.nextInt();
            }
        }
        for(int t=0; t<n; t++) {
            int cnt = 0;
            boolean[] visited = new boolean[n];
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < n; j++) {
                    if (t!=j&&(array[t][i] == array[j][i])&&!visited[j]){
                        cnt++;
                        visited[j] = true;
                    }
                }
            }
            count[t] = cnt;
        }
        int max = 0;
        int result = 0;

        for(int i=0; i<count.length; i++){
            if(max < count[i]){
                max = count[i];
                result = i;
            }
        }

        System.out.println(result+1);
    }
}
