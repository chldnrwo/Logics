package Baekjoon.Main;
import java.util.Scanner;

public class BOJ1309_바텀업dp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        if (n == 1) {
            System.out.println(3);
            System.exit(0);
        }

        int[][] arr = new int[n + 1][3];

        arr[1][0] = 1;
        arr[1][1] = 1;
        arr[1][2] = 1;

        for (int i = 2; i <= n; i++) {
            arr[i][0] = (arr[i - 1][0] + arr[i - 1][2]) % 9901;
            arr[i][1] = (arr[i - 1][1] + arr[i - 1][2]) % 9901;
            arr[i][2] = (arr[i - 1][0] + arr[i - 1][1] + arr[i - 1][2]) % 9901;
        }

        int result = (arr[n-1][0] * 2 + arr[n-1][1] * 2 + arr[n-1][2] * 3) % 9901;
        System.out.println(result);
    }
}
