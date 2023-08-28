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

public class BOJ2446{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		for(int i=0;i<n;i++) { // 0 1 2 3 4
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<2*(n-i)-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0;i<n-1;i++) { //0 1 2 3 
			for(int j=0;j<n-2-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<2*(i+1)+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
