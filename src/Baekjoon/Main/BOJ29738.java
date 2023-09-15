package Baekjoon.Main;
import java.util.*;

public class BOJ29738{

	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		for(int i=1;i<=n;i++) {
			int a = in.nextInt();
			
			if(4500<a) {
				System.out.println("Case #"+i+": Round 1");
			}else if(1000<a) {
				System.out.println("Case #"+i+": Round 2");
			}else if(25<a) {
				System.out.println("Case #"+i+": Round 3");
			}else {
				System.out.println("Case #"+i+": World Finals");
			}
		}
		
	}
	
}

/*
4
10000
1234
567
8

Case #1: Round 1
Case #2: Round 2
Case #3: Round 3
Case #4: World Finals

 */