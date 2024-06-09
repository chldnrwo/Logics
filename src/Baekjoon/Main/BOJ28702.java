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

public class BOJ28702{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		String[] arr = new String[3];
		int num = 0;
		for(int i=0;i<3;i++) {
			arr[i] = in.next();
			if(!(arr[i].equals("Fizz") || arr[i].equals("Buzz") || arr[i].equals("FizzBuzz"))) {
				num = Integer.parseInt(arr[i])+(3-i);
				break;
			}
		}
		
		if(num%3==0 && num%5==0) {
			System.out.println("FizzBuzz");
		}else if(num%3==0) {
			System.out.println("Fizz");
		}else if(num%5==0) {
			System.out.println("Buzz");
		}else {
			System.out.println(num);
		}
	
		
	}	
}
/*
0 1 -3
2 3 -1
 
 */