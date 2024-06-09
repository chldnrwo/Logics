package Baekjoon.Main;

import java.util.Scanner;

public class BOJ9506_refac {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
           	int n = in.nextInt();
            if (n == -1) {
                break;
            }

            int sum = 0;
            StringBuilder sb = new StringBuilder();
            sb.append(n).append(" = ");
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sum += i;
                    sb.append(i).append(" + ");
                }
            }

            if (sum == n) {
                sb.replace(sb.length() - 3, sb.length(), ""); // 마지막 " + " 삭제
                System.out.println(sb);
            } else {
                System.out.println(n + " is NOT perfect.");
            }
        }
    }
}
