package Baekjoon.Main;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class BOJ28701{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		int fir = 0;
		int sec = 0;
		int thr = 0;
		for(int i=1;i<=n;i++) {
			fir+=i;
		}
		sec = fir*fir;
		
		for(int i=1;i<=n;i++) {
			thr+=i*i*i;
		}

		System.out.println(fir);
		System.out.println(sec);
		System.out.println(thr);
	}	
}
/*
0 1 -3
2 3 -1
 
 */