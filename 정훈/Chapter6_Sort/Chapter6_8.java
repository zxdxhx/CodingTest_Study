package CodingTest_Study.정훈.Chapter6_Sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Chapter6_8{
    static int n, m;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int[] arr= new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int lt = 0;
        int rt = n-1;
        int answer = 0;
        while(lt <= rt) {
            int mid = (lt+rt) / 2;
            if(arr[mid] == m){
                answer = mid + 1;
                break;
            }
            if(arr[mid] > m) rt = mid-1;
            else lt = mid+1;
        }
        System.out.println(answer);
    }

}
