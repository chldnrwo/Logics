import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack<>();
		
		double sum = 0;
		double sum2 = 0;
		for(int i=0;i<20;i++) {
			String s = in.next();
			double d = in.nextDouble();
			String s2 = in.next();
			double d2 = 0;
			
			if(s2.equals("A+")) {
				d2 = 4.5;
			}else if(s2.equals("A0")) {
				d2 = 4.0;
			}else if(s2.equals("B+")) {
				d2 = 3.5;
			}else if(s2.equals("B0")) {
				d2 = 3.0;
			}else if(s2.equals("C+")) {
				d2 = 2.5;
			}else if(s2.equals("C0")) {
				d2 = 2.0;
			}else if(s2.equals("D+")) {
				d2 = 1.5;
			}else if(s2.equals("D0")) {
				d2 = 1.0;
			}else {
				d2 = 0;
			}
			
			if(!s2.equals("P")) {
				sum2+=d;
			}
			
			sum+=(d2*d);
		}
		double result = sum / sum2;
		System.out.printf("%.6f", result);
	}
}