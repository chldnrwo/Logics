package Baekjoon.Main;
import java.math.BigInteger;
import java.util.*;

public class BOJ2490{
	static Integer[] arr;
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		for(int i=0;i<3;i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();
			int d = in.nextInt();
			
			int res = a+b+c+d;
			if(res==0) {
				System.out.println("D");
			}else if(res==1) {
				System.out.println("C");
			}else if(res==2) {
				System.out.println("B");
			}else if(res==3) {
				System.out.println("A");
			}else {
				System.out.println("E");
			}
		}
	}
	
}

