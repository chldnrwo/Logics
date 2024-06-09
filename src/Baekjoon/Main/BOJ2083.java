package Baekjoon.Main;
import java.util.*;

public class BOJ2083{
	static Integer[] arr;
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		while(true) {
			String s= in.next();
			int a = in.nextInt();
			int b = in.nextInt();
			
			if(s.equals("#") && a==0 && b==0) {
				break;
			}else if(17<a || 80<=b) {
				System.out.println(s+" "+"Senior");
			}else {
				System.out.println(s+" "+"Junior");
			}
			
			
		}
	}
	
}

