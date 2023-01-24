package CodingTest_Study.도희.Chapter3_TwoPointers;
//시간초과로 강의
import java.util.*;

public class Chapter3_1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int[] arr = new int[num];
        for(int i = 0; i<num; i++){
            arr[i] = scan.nextInt();
        }
        int num2 = scan.nextInt();
        int[] arr2 = new int[num2];
        for(int i = 0; i<num2; i++){
            arr2[i] = scan.nextInt();
        }
        int p1 = 0; int p2 = 0;
        String answer = "";
        while(p1 < num && p2 < num2){
            if(arr[p1]<arr2[p2]){
                answer += arr[p1++] + " ";
            }else {
                answer += arr2[p2++] + " ";
            }
        }
        while(p2 < num2){
            answer += arr2[p2++] + " ";
        }
        while(p1 < num) {
            answer += arr[p1++] + " ";
        }
        System.out.println(answer);
    }
}

/*
public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int[] arr = new int[num];
        for(int i = 0; i<num; i++){
            arr[i] = scan.nextInt();
        }
        int num2 = scan.nextInt();
        int[] arr2 = new int[num2];
        for(int i = 0; i<num2; i++){
            arr2[i] = scan.nextInt();
        }
        int p1 = 0; int p2 = 0;
        String answer = "";
        while(p1 < num && p2 < num2){
            if(arr[p1]<arr2[p2]){
                answer += arr[p1++] + " ";
            }else if(arr[p1]>arr2[p2]){
                answer += arr2[p2++] + " ";
            }else if(arr[p1] == arr[p2]){
                answer += arr[p1++] + " "+arr2[p2++] + " ";
            }
        }
        if(p1==num){
            while(p2 < num2){
                answer += arr2[p2++] + " ";
            }
        }
        else if(p2 == num2){
            while(p1 < num) {
                answer += arr[p1++] + " ";
            }
        }
        System.out.println(answer);
    }
*/