package CodingTest_Study.정환.Chapter4_Hash;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Chapter4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        HashMap<String, Integer> map = new HashMap<>();

            String candidate = sc.next();

            for(int i=0; i<candidate.length(); i++){
                String word = String.valueOf(candidate.charAt(i));

                if(map.containsKey(word)){
                    map.put(word, map.get(word)+1);
                }
                else{
                    map.put(word, 1);
                }
            }


        Iterator<String> key = map.keySet().iterator();
            int max = 0;
            String result = "";
            while(key.hasNext()){
                String s = key.next();

                if(max < map.get(s)){
                    max = map.get(s);
                    result = s;
                }

            }
        System.out.println(result);

    }
}
