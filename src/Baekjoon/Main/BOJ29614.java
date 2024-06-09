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

public class BOJ29614{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		String s = in.next();
		
		double sum = 0;
		int cnt = 0;
		
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c == 'A') {
				sum += 4;
				cnt++;
			}else if(c == 'B') {
				sum += 3;
				cnt++;
			}else if(c == 'C') {
				sum += 2;
				cnt++;
			}else if(c == 'D') {
				sum += 1;
				cnt++;
			}else if(c == 'F') {
				cnt++;
			}else if(c == '+') {
				sum += 0.5;
			}
			
			
		}
		System.out.printf("%.5f",sum/cnt);
	}
}
