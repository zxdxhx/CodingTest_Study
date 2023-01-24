package CodingTest_Study.정환.Chapter4_Hash;

import java.util.*;

public class Chapter4_5 {
    static Set<Integer> set = new HashSet<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] array = new int[n];
        for(int i=0; i<array.length; i++){
            array[i] = sc.nextInt();
        }
        boolean[] visited = new boolean[n];
        dfs(0, 0, array, 3, visited);

        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list, Collections.reverseOrder());

        if(list.size()>t){
            System.out.println(list.get(t-1));
        }
        else{
            System.out.println(-1);
        }



    }

    static void dfs(int start, int sum, int[] array, int len, boolean[] visited){
        if(start==len){
            set.add(sum);
            return;
        }

            for(int i=0; i<array.length; i++){
                if(!visited[i]){
                    visited[i] = true;
                    dfs(start+1, sum+array[i], array, len, visited);
                    visited[i]=false;
                }

            }


    }
}
