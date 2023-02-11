package CodingTest_Study.도희.Chapter6_Sort;
//문제 자체를 이해못함..;;
import java.util.*;

public class Chapter6_9 {
    public static int count(int[] arr, int capacity){
        int cnt=1, sum=0;
        for(int x : arr){
            if(sum+x>capacity){
                cnt++;
                sum=x;
            }
            else sum+=x;
        }
        return cnt;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();

        int[] arr = new int[N];
        for(int i = 0; i< N; i++){
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        int answer = 0;
        int lt =  arr[0];
        int rt = arr[N];

        while(lt<= rt){
            int mid = (lt+rt)/2;
            if(count(arr, mid)<=M){
                answer = mid;
                rt = mid-1;
            }
            else
                lt = mid+1;
        }

        System.out.println(answer);
    }
}
