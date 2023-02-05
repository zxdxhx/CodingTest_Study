package CodingTest_Study.정환.Chapter5_Stack;


import java.lang.reflect.Array;
import java.util.*;

public class Chapter5_8 {

    static class patient{
        int num;
        int rank;

        patient(int num, int rank){
            this.rank = rank;
            this.num = num;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        List<patient> list = new ArrayList<>();
        int point = 0;
        int index = 0;
        for(int i=0; i<n; i++){
            int p = sc.nextInt();
            if(i == k){
                point = p;
                index = i;
            }
           list.add(new patient(i, p));
        }

        int count = 0;
        while(true){
            boolean check = false;
            int s = list.get(0).rank;
            for(int i=0; i<list.size(); i++){
                if(list.get(i).rank > s){
                    check = true;
                    break;
                }
            }
            if(check == true){
                patient p = list.remove(0);
                list.add(p);
            }
            else{
                patient curr = list.remove(0);
                count++;
                if(curr.num == index&& curr.rank == point){
                    System.out.println(count);
                    break;
                }
            }

        }

    }
}
