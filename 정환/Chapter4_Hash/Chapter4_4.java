package CodingTest_Study.정환.Chapter4_Hash;

import java.util.*;

public class Chapter4_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        Map<Character, Integer> map = new HashMap<>();

        for(int i=0; i<t.length(); i++){
            if(map.containsKey(t.charAt(i))){
                map.put(t.charAt(i), map.get(t.charAt(i))+1);
            }
            else{
                map.put(t.charAt(i), 1);
            }
        }
        int answer = 0;
        for(int i=0; i<=s.length()-t.length(); i++){
            Map<Character, Integer> map2 = new HashMap<>();
            for(int j=i; j<t.length()+i; j++){
                if(map2.containsKey(s.charAt(j))){
                    map2.put(s.charAt(j), map2.get(s.charAt(j))+1);
                }
                else{
                    map2.put(s.charAt(j), 1);
                }
            }
            if(map.equals(map2)){
                answer++;
            }

        }
        System.out.println(answer);
    }

}
