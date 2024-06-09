package Baekjoon2024;
import java.io.*;
import java.util.*;

public class BOJ31472 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		//m^2 = 2n
		int res = (int)Math.sqrt(2*n) * 4;
		
		System.out.println(res);
	}
}