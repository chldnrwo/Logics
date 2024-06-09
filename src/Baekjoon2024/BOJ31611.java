package Baekjoon2024;
import java.io.*;
import java.util.*;

public class BOJ31611 {
	
	public static void main(String[] args) throws IOException {
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		if(n%7==2) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}
	
}