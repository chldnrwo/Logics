package Baekjoon.Main;
import java.util.Scanner;

public class BOJ28255 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < t; i++) {
            String s = in.next();
            int a = (int) Math.ceil(s.length() / 3.0);
            String firstPart = s.substring(0, a);
            String remaining = s.substring(a);

            String reversedFirstPart = new StringBuilder(firstPart).reverse().toString();
            
            // 조건들
            boolean condition1 = remaining.equals(reversedFirstPart + firstPart);
            boolean condition2 = remaining.equals(reversedFirstPart.substring(1) + firstPart);
            boolean condition3 = remaining.equals(reversedFirstPart + firstPart.substring(1));
            boolean condition4 = remaining.equals(reversedFirstPart.substring(1) + firstPart.substring(1));
            
            // 결과 추가
            if (condition1 || condition2 || condition3 || condition4) {
                sb.append(1).append("\n");
            } else {
                sb.append(0).append("\n");
            }
        }
        
        System.out.println(sb);
    }
}
