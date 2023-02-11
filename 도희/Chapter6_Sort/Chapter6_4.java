package CodingTest_Study.도희.Chapter6_Sort;
//풀이법 강의보고
import java.util.*;

public class Chapter6_4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int S = scan.nextInt();
        int N = scan.nextInt();

        int[] cache = new int[S];

        for(int i = 0; i<N; i++) {
            int n = scan.nextInt();
            int index = -1;
            for(int j = 0; j < S; j++){
                if(cache[j]==n)//miss
                    index = j;
            }

            if (index == -1) {//miss
                for(int j = S-1; j>=1; j--){
                    cache[j] = cache[j-1];
                }
            }
            else{   //hit
                for(int j = index; j>=1; j--){
                    cache[j] = cache[j-1];
                }
            }
            cache[0] = n;
        }
        for(int i = 0; i<S; i++){
            System.out.print(cache[i] + " ");
        }

    }
}
