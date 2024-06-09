package Baekjoon.Main;
import java.util.*;

public class BOJ17388{

	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		int s =in.nextInt();
		int k =in.nextInt();
		int h =in.nextInt();
		
		int min = Math.min(Math.min(s, k), h);
		
		if(s+k+h>=100) {
			System.out.println("OK");
		}else {
			if(min == s) {
				System.out.println("Soongsil");
			}else if(min == k) {
				System.out.println("Korea");
			}else if(min == h) {
				System.out.println("Hanyang");
			}
			
		}
	}
	
}
