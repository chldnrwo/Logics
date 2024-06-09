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

public class BOJ28453{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<n;i++) {
			int num = in.nextInt();
			if(num == 300) {
				sb.append(1).append(" ");
			}else if(num>=275) {
				sb.append(2).append(" ");
			}else if(num>=250) {
				sb.append(3).append(" ");
			}else {
				sb.append(4).append(" ");
			}
			
		}
		System.out.println(sb);
	}	
}
/*
0 1 -3
2 3 -1
 
 */