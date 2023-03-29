package Baekjoon.Main;
import java.util.Scanner;

class BOJ4134{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder(); 
		int t = in.nextInt();
		
		for(int i=0;i<t;i++) {
			long n = in.nextLong();
			
			while(true) {
				if(n==0||n==1) {
					sb.append(2).append("\n");
					break;
				}else if(sosu(n)) {
					sb.append(n).append("\n");
					break;
				}else {
					n++;
				}				
			}
		}
		
		System.out.println(sb);
	}
	public static boolean sosu(long n) {
		
		long m = (long)Math.sqrt(n);
		for(int i=2;i<=m;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
}