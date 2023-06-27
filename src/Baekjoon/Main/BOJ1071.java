package Baekjoon.Main;
import java.util.*;

public class BOJ1071 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        
        Collections.sort(list);
        
        for (int i = 0; i < n; i++) {
            if (i + 1 < list.size() && list.get(i) + 1 == list.get(i + 1)) {
                int end = i + 2;
                if (end != n) {
                    while (end < list.size() && list.get(end).equals(list.get(i + 1))) {
                        end++;
                    }
                }
                
                if (end == n) {
                    int start = i - 1;
                    if (start >= 0) {
                        while (start >= 0 && list.get(start).equals(list.get(i))) {
                            start--;
                        }
                    }
                    
                    list.set(start + 1, list.get(start + 1) + 1);
                    list.set(i + 1, list.get(i + 1) - 1);
                } else {
                    int temp = list.get(end);
                    list.set(end, list.get(i + 1));
                    list.set(i + 1, temp);
                }
            }
        }
        
        for (int value : list) {
            System.out.print(value + " ");
        }
    }
}