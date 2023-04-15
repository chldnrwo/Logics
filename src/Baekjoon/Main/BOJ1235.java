package Baekjoon.Main;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class BOJ1235{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		String[] arr = new String[t];
		for(int i=0;i<t;i++) {
			arr[i] = in.next();
		}
		
		Set<String> set = new HashSet<>();
		
		for(int i=arr[0].length()-1;i>=0;i--) {
			for(int j=0;j<t;j++) {
				String s1 = arr[j].substring(i);
				if(!set.contains(s1)) {
					set.add(s1);
				}
			}
			if(set.size()!=t) {
				set = new HashSet<>(); 
			}else {
				int a = arr[0].length() - i;
				System.out.println(a);
				break;
			}
		}
		
		
	}
}
/*
문자열은 100자리까지오니까 
숫자로 비교 힘듬



 */