package Baekjoon.Main;
import java.util.*;

public class BOJ1924{
	
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		int x = in.nextInt();
		int y = in.nextInt();
		int[] arr = new int[12];
		
		int sum = 0;
		for(int i=1;i<x;i++) {
			if(i==1 || i==3 || i==5
					|| i==7 || i==8 || i==10 | i==12) {
				sum+=31;
			}else if(i==2) {
				sum+=28;
			}else {
				sum+=30;
			}
		}
		sum+=y;
		
		sum%=7;
		
		if(sum == 0) {
			System.out.println("SUN");
		}else if(sum == 1) {
			System.out.println("MON");
		}else if(sum == 2) {
			System.out.println("TUE");
		}else if(sum == 3) {
			System.out.println("WED");
		}else if(sum == 4) {
			System.out.println("THU");
		}else if(sum == 5) {
			System.out.println("FRI");
		}else if(sum == 6) {
			System.out.println("SAT");
		}
		
	}
	
}

