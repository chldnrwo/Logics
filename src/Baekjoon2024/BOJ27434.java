package Baekjoon2024;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class BOJ27434 {
    public static void main(String[] args) throws Exception {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.valueOf(br.readLine());

        System.out.println(factorial(1, N));
    }

    public static BigInteger factorial(int a, int n){
        BigInteger num = BigInteger.valueOf(a);

        if (a < n){
            int b = (a + n) / 2;
            num = factorial(a,b).multiply(factorial(b+1, n));
        }
        return num;
    }
}