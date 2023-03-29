package Baekjoon.Main;
import java.util.Scanner;

class BOJ1735{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int d = in.nextInt();
		
		int z = eucd(b, d);
		b/=z;
		d/=z;
		a = a*d;
		c = c*b;
		int x = a+c;
		int y = b*d*z;
		
		int z2 = eucd(x, y);
		
		x/=z2;
		y/=z2;
		System.out.println(x+" "+y);
	}
	
	public static int eucd(int a,int b) {
		int r = a%b;
		if(r==0) {
			return b;
		}else {
			return eucd(b, r);
		}
	}
}