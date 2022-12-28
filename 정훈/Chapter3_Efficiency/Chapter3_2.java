package CodingTest_Study.정훈.Chapter3_Efficiency;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Chapter3_2 {
    public static void main(String[] args) throws Exception{
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        Stream<Integer> stream = list.stream();
        Set<Integer> set = new HashSet<>();
        stream.filter(c -> !set.add(c))
                .collect(Collectors.toSet())
                .stream().sorted()
                .forEach(item -> System.out.print(item + " "));
    }
}
