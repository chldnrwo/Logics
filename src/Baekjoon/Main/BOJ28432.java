package Baekjoon.Main;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class BOJ28432{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		List<String> slist = new ArrayList<>();
		for(int i =0;i<n;i++) {
			slist.add(in.next());
		}
		int n2 = in.nextInt();
		String[] sarr2 = new String[n2];
		for(int i =0;i<n2;i++) {
			sarr2[i] = in.next();
		}
		
		for(int i =0;i<n;i++) {
			if(slist.get(i).equals("?")) {
				if(i == 0) {
					char c = slist.get(i+1).charAt(0); //첫번째가 ?일 경우
					for(int j=0;j<n2;j++) {
						if(sarr2[j].charAt(sarr2[j].length()-1) == c
								&& !slist.contains(sarr2[j])) {
							System.out.println(sarr2[j]);
						}
					}
				}
				else if(i == (n-1)) {
					char c = slist.get(i-1).charAt(slist.get(i-1).length()-1); //마지막이 ?일 경우
					for(int j=0;j<n2;j++) {
						if(sarr2[j].charAt(0) == c
								&& !slist.contains(sarr2[j])) {
							System.out.println(sarr2[j]);
						}
					}
				}else {
					char c1 = slist.get(i-1).charAt(slist.get(i-1).length()-1);
					char c2 = slist.get(i+1).charAt(0);
					
					for(int j=0;j<n2;j++) {
						if(sarr2[j].charAt(0) == c1
								&& sarr2[j].charAt(sarr2[j].length()-1) == c2
								&& !slist.contains(sarr2[j])) {
							System.out.println(sarr2[j]);
						}
					}
				}
				
				
				
			}
		}
	
	}	
}
