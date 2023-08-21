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

public class BOJ28691{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		String s = in.next();
		if(s.equals("M")) {
			System.out.println("MatKor");
		}else if(s.equals("W")) {
			System.out.println("WiCys");
		}else if(s.equals("C")) {
			System.out.println("CyKor");
		}else if(s.equals("A")) {
			System.out.println("AlKor");
		}else if(s.equals("$")) {
			System.out.println("$clear");
		}
	}	
}
