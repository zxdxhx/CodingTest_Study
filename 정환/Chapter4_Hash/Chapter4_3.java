package CodingTest_Study.정환.Chapter4_Hash;

import java.util.*;

public class Chapter4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] array = new int[n];
        for(int i=0; i<n; i++){
            array[i] = sc.nextInt();
        }

        Map<Integer, Integer> map = new HashMap<>();

        int st = 0;
        int rt = k-1;

        for(int i=st; i<=rt; i++){
            if(map.containsKey(array[i])){
                map.put(array[i], map.get(array[i])+1);
            }else{
                map.put(array[i], 1);
            }
        }
        System.out.print(map.size()+" ");
        while(rt<array.length-1){
            if(map.get(array[st])>1&&map.get(array[st])!=null){
                map.put(array[st], map.get(array[st])-1);
            }
            else{
                map.remove(array[st]);
            }
            st++;
            rt++;
            if(map.containsKey(array[rt])){
                map.put(array[rt], map.get(array[rt])+1);
            }else{
                map.put(array[rt], 1);
            }
            System.out.print(map.size()+" ");
        }
    }
}
