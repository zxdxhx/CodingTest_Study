package CodingTest_Study.정훈.Chapter4_Hash;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Chapter4_3 {
    static int n, m;
    static int[] arr;
    static int[] result;
    static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        arr = new int[n];
        result = new int[m];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        solve();

        for (int a :
                list) {
            System.out.print(a + " ");
        }
    }

    private static void solve() {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < m - 1; i++) {
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        int lt = 0;
        for (int rt = m-1; rt < n; rt++) {
            map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
            list.add(map.size());
            map.put(arr[lt], map.get(arr[lt]) - 1);
            if(map.get(arr[lt]) == 0) map.remove(arr[lt]);
            lt++;
        }
    }

}
