package Baekjoon.Main;
import java.util.Scanner;

class BOJ24313 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		long a1 = in.nextLong();
		long a0 = in.nextLong();
		long c = in.nextLong();
		long n0 = in.nextLong();
		
		long tmp = a1 * n0 + a0;
		long tmp2 = c*n0;
		
		if(tmp<=tmp2 && c-a1>=0) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		
	}
}
