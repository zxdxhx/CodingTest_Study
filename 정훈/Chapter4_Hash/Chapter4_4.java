package CodingTest_Study.정훈.Chapter4_Hash;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Chapter4_4 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String str2 = br.readLine();

        int answer = 0;
        HashMap<Character, Integer> am = new HashMap<>();
        HashMap<Character, Integer> bm = new HashMap<>();

        for(char s : str2.toCharArray()) bm.put(s, bm.getOrDefault(s, 0) + 1);

        int l = str2.length()-1;

        for (int i = 0; i < l; i++) {
            am.put(str.charAt(i), am.getOrDefault(str.charAt(i), 0) + 1);
        }
        int lt = 0;
        for (int rt = l; rt < str.length(); rt++) {
            am.put(str.charAt(rt), am.getOrDefault(str.charAt(rt), 0) + 1);
            if(am.equals(bm)) answer++;
            am.put(str.charAt(lt), am.get(str.charAt(lt))-1);

            if(am.get(str.charAt(lt)) == 0) am.remove(str.charAt(lt));
            lt++;
        }

        System.out.println(answer);
    }
}
