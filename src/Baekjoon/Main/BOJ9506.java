package Baekjoon.Main;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
//백준 25206 심화 문자열
class BOJ9506 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		List<Integer> list;
		
		while(true) {
			list = new ArrayList<>();
			int a = in.nextInt();
			if(a==-1) {
				break;
			}
			
			int sum = 0;
			for(int i=1;i<a;i++) {
				if(a%i==0) {
					sum+=i;
					list.add(i);
				}
			}
			if(sum == a) {
				sb.append(a+" = ");
				for(int i=0;i<list.size()-1;i++) {
					sb.append(list.get(i)+" + ");
				}
				sb.append(list.get(list.size()-1));
			}else {
				sb.append(a+" is NOT perfect.");
			
			}
			sb.append("\n");
			
		}
		System.out.println(sb);
	}
}
//gcd 써야되나?