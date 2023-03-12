package CodingTest_Study.정훈.Chapter6_Sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Chapter6_10 {
    static int n,c;
    static int[] arr;
    static int answer;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int lt = 1;
        int rt = arr[n-1];
        while(lt<=rt) {
            int mid = (lt+rt) / 2;
            if(count(arr, mid) >= c){
                answer = mid;
                lt = mid+ 1;
            }
            else rt = mid-1;
        }

        System.out.println(answer);





    }

    private static int count(int[] arr, int dist) {
        int cnt = 1;
        int ep = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] - ep >= dist ){
                cnt++;
                ep = arr[i];
            }
        }
        return cnt;
    }
}
