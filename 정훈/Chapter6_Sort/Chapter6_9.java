package CodingTest_Study.정훈.Chapter6_Sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Chapter6_9 {
    static int n,m;
    static int[] arr;
    static int answer;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();
        while (lt <= rt) {
            int mid = (lt+rt) / 2;
            if(count(arr, mid) <= m) {
                answer = mid;
                rt = mid - 1;
            }
            else {
                lt = mid + 1;
            }
        }
        System.out.println(answer);

    }

    private static int count(int[] arr, int mid) {
        int cnt = 1;
        int sum = 0;
        for(int a : arr) {
            if(sum+a > mid) {
                cnt++;
                sum = a;
            }else {
                sum += a;
            }
        }
        return cnt;
    }
}
