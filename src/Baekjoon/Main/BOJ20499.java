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

public class BOJ20499{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		String str = in.next();
		
		String[] arr = str.split("/");
		int k = Integer.parseInt(arr[0]);
		int d = Integer.parseInt(arr[1]);
		int a = Integer.parseInt(arr[2]);
		
		if(k+a-d<0 || d==0) {
			System.out.println("hasu");
		} else {
			System.out.println("gosu");
		}
		
	}	
}
/*
0 1 -3
2 3 -1
 
 */