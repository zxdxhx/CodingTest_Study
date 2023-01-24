package CodingTest_Study.정환.Chapter4_Hash;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Chapter4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> one = new HashMap<>();
        HashMap<String, Integer> two = new HashMap<>();

        String a = sc.next();
        String b = sc.next();

        for(int i=0; i<a.length(); i++){
            String c = String.valueOf(a.charAt(i));
            if(one.containsKey(c)){
                one.put(c, one.get(c)+1);
            }
            else{
                one.put(c, 1);
            }
        }
        for(int i=0; i<a.length(); i++){
            String c = String.valueOf(b.charAt(i));
            if(two.containsKey(c)){
                two.put(c, two.get(c)+1);
            }
            else{
                two.put(c, 1);
            }
        }

        Set<String> keysetone = one.keySet();


        Iterator<String> ione = keysetone.iterator();

        boolean result = true;
        boolean check = false;


        while(ione.hasNext()){
            String cone = ione.next();
            Set<String> keysettwo = two.keySet();
            Iterator<String> itwo = keysettwo.iterator();
            while (itwo.hasNext()){
                String ctwo = itwo.next();

                if(cone.equals(ctwo)){
                    check = true;
                    if(one.get(cone) == two.get(ctwo)){
                        result = true;
                    }
                    else{
                        result = false;
                        break;
                    }
                }
            }
            if(check == false){
                result = false;
                break;
            }
            if(result == false){
                break;
            }

        }


        if(result == true){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
