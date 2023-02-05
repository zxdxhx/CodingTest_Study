package CodingTest_Study.정환.Chapter3_Two;

import java.util.*;

public class Chapter3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            list.add(sc.nextInt());
        }
        int m = sc.nextInt();
        for(int i=0; i<m; i++){
            list.add(sc.nextInt());
        }
        Collections.sort(list);

        for(int i : list){
            System.out.print(i + " ");
        }
    }
}
