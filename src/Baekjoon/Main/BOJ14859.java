package Baekjoon.Main;
import java.util.Scanner;

public class BOJ14859 {

    private static final int mx = (int)1e6 + 5;
    private static long[] mu = new long[mx];
    private static long[] c = new long[mx];
    private static long ans = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        mu[0] = 0;
        mu[1] = 1;

        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            c[x]++;
        }

        for (int i = 1; i < mx; i++) {
            if (mu[i] == 0) continue;
            long v = c[i];
            for (int j = i + i; j < mx; j += i) {
                v += c[j];
                mu[j] -= mu[i];
            }
            ans += mu[i] * v * (v-1) * (v-2) / 6;
        }

        System.out.println(ans);
    }
}