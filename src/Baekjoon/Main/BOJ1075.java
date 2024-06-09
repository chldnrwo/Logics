package Baekjoon.Main;
import java.util.Scanner;

class BOJ1075{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int F = in.nextInt();
		
		N = (N / 100) * 100;
		
		for(int i=0;i<100;i++) {
			if((N+i)%F==0) {
				String s;
				if(i<10) {
					s = 0+Integer.toString(i);
				}else {
					s = Integer.toString(i);
				}
				
				System.out.println(s);
				break;
			}
		}
	}
}