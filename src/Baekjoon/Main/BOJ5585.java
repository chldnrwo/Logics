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

public class BOJ5585{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int sum = 0;
		
		n = 1000-n;
		sum+=n/500;
		n%=500;
		sum+=n/100;
		n%=100;
		sum+=n/50;
		n%=50;
		sum+=n/10;
		n%=10;
		sum+=n/5;
		n%=5;
		sum+=n/1;
		
		System.out.println(sum);
	}
}
