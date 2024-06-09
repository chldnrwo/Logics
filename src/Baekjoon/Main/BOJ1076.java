package Baekjoon.Main;
import java.util.Scanner;

class BOJ1076{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String a = in.next();
		String b = in.next();
		String c = in.next();
		
		int A = 0;
		int B = 0;
		int C = 0;
		
		switch(a) {
		case "black":
			A = 0;
			break;
		case "brown":
			A = 1;
			break;
		case "red":
			A = 2;
			break;
		case "orange":
			A = 3;
			break;
		case "yellow":
			A = 4;
			break;
		case "green":
			A = 5;
			break;
		case "blue":
			A = 6;
			break;
		case "violet":
			A = 7;
			break;
		case "grey":
			A = 8;
			break;
		case "white":
			A = 9;
			break;
		}
		
		switch(b) {
		case "black":
			B = 0;
			break;
		case "brown":
			B = 1;
			break;
		case "red":
			B = 2;
			break;
		case "orange":
			B = 3;
			break;
		case "yellow":
			B = 4;
			break;
		case "green":
			B = 5;
			break;
		case "blue":
			B = 6;
			break;
		case "violet":
			B = 7;
			break;
		case "grey":
			B = 8;
			break;
		case "white":
			B = 9;
			break;
		}
		
		switch(c) {
		case "black":
			C = 1;
			break;
		case "brown":
			C = 10;
			break;
		case "red":
			C = 100;
			break;
		case "orange":
			C = 1000;
			break;
		case "yellow":
			C = 10000;
			break;
		case "green":
			C = 100000;
			break;
		case "blue":
			C = 1000000;
			break;
		case "violet":
			C = 10000000;
			break;
		case "grey":
			C = 100000000;
			break;
		case "white":
			C = 1_000_000_000;
			break;
		}
		
		long result = (long)(A*10+B)*C;
		System.out.println(result);
	}
}