package CodingTest_Study.도희.Chapter4_Stack_Queue;
//강의
import java.util.*;

public class Chapter5_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        Stack<Character> stack = new Stack<>();
        for (char x : str.toCharArray()) {
            if (x == '(') stack.push(x);
            else {
                if (stack.isEmpty()) {
                    System.out.println("NO");
                    return;
                }
                stack.pop();
            }
        }
        if (!stack.isEmpty()) {
            System.out.println("NO");
            return;
        }
        System.out.println("YES");
    }
}
