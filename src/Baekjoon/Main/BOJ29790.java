package Baekjoon.Main;
import java.util.*;

public class BOJ29790{

	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int u= in.nextInt();
		int l = in.nextInt();
		
		if(n>=1000 && (u>=8000 || l>=260)) {
			System.out.println("Very Good");
		}else if(n>=1000) {
			System.out.println("Good");
		}else {
			System.out.println("Bad");
		}
	}
	
}
