package CodingTest_Study.정환.Chapter6_Sort;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Chapter6_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Set<Integer> set = new HashSet<>();

        for(int i=0; i<n; i++){
            set.add(sc.nextInt());
        }
        if(set.size() == n){
            System.out.println("U");
        }else{
            System.out.println("D");
        }
    }
}
