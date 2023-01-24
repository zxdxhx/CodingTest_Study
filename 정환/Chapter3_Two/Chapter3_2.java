package CodingTest_Study.정환.Chapter3_Two;

import java.util.*;

public class Chapter3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> result = new ArrayList<>();

        int[] array = new int[n];
        for(int i=0; i<n; i++){
            array[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] array2 = new int[m];
        for(int i=0; i<m; i++){
            array2[i] = sc.nextInt();
        }
        Arrays.sort(array);
        Arrays.sort(array2);
        int st = 0;
        int rt = 0;
        while(st<n&&rt<m){

            if(array[st] == array2[rt]){
                result.add(array[st]);
                st++;
                rt++;
            }
            else if(array[st] < array2[rt]){
                st++;
            }
            else{
                rt++;
            }
        }

        for(int i : result){
            System.out.print(i + " ");
        }


    }
}
