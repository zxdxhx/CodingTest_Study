package CodingTest_Study.정훈.Chapter3_Efficiency;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Chapter3_1 {
    public static void main(String[] args) throws  Exception{
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
//            stack.push(Integer.parseInt(st.nextToken()));
            list.add(Integer.parseInt(st.nextToken()));
        }
        int m = Integer.parseInt(br.readLine());
//        int[] arr2 = new int[n+m];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
//            stack.push(Integer.parseInt(st.nextToken()));
            list.add(Integer.parseInt(st.nextToken()));
        }
        int i = 0;
//        while(!stack.isEmpty()){
//            arr2[i++] = stack.pop();
//        }
//        Arrays.sort(arr2);

        Collections.sort(list);
//        for (int a:
//             arr2) {
//            System.out.print(a+ " ");
//        }

        for(int a: list) System.out.print(a+ " ");
    }
}
