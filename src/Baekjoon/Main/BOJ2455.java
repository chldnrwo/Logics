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

public class BOJ2455{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		int max = 0;
		int now = 0;
		for(int i=0;i<4;i++) {
			int output =in.nextInt();
			int input = in.nextInt();
			now = now - output + input;
			if(now > max) {
				max = now;
			}
			//System.out.println(now);
		}
		
		System.out.println(max);
	}
}
