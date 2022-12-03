package CodingTest_Study.도희.Chapter2_Array;

import java.util.Scanner;

public class Chapter2_3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.nextLine();
        int[] A = new int[num];
        int[] B = new int[num];
        for(int i = 0; i< num; i++){
            A[i] = scan.nextInt();
        }
        scan.nextLine();
        for(int i = 0; i< num; i++){
            B[i] = scan.nextInt();
        }
        String answer = "";
        for(int i = 0 ; i< num; i++){
            if(A[i] == 1 && B[i] == 3)
                answer += "A" + "\n";
            else if(A[i] == 2 && B[i] == 1)
                answer += "A" + "\n";
            else if(A[i] == 3 && B[i] == 2)
                answer += "A" + "\n";
            else if(A[i] == B[i])
                answer += "D" + "\n";
            else
                answer += "B" + "\n";
        }
        System.out.println(answer);
    }
}
