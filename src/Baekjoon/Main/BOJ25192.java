package Baekjoon.Main;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class BOJ25192{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		Set<String> set = new HashSet<>();
		
		int sum = 0;
		
		for(int i=0;i<t;i++) {
			String s = in.next();
			if(s.equals("ENTER")) {
				sum+=set.size();
				set = new HashSet<>();
			}else {
				set.add(s);
			}
		}
		sum+=set.size();
		System.out.println(sum);
	}
}