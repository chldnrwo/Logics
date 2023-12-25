package Baekjoon.Main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class BOJ31000{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		
		int cnt = (2*N+1) * (2*N+1);
		
		for (int a = -N; a <= N; a++) {
            if (a == 0) continue; // a = 0인 경우는 이미 계산됨
            for (int b = -N; b <= N; b++) {
                int c = 1 - a - b;
                if (c >= -N && c <= N) {
                    cnt++;
                }
            }
        }
		System.out.println(cnt);
	}
}

