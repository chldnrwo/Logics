package Baekjoon.Main;

import java.util.*;

public class Main{
	static Integer[] arr;
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		for(int i=0;i<15;i++) {
			String s = in.nextLine();
			System.out.println(s);
			for(int j=0;j<s.length();j++) {
				if(s.charAt(j) == 'w') {
					System.out.println("chunbae");
					System.exit(0);
				}else if(s.charAt(j) == 'b') {
					System.out.println("nabi");
					System.exit(0);
				}else if(s.charAt(j) == 'g') {
					System.out.println("yeungcheol");
					System.exit(0);
				}
			}
		}
	}
	
}

