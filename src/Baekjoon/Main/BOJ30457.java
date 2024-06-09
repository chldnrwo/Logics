package Baekjoon.Main;

import java.util.*;

public class BOJ30457{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
//		List<Integer> list = new ArrayList<>();
//		List<Integer> list2 = new ArrayList<>();
//		
//		for(int i=0;i<n;i++) {
//			int a = in.nextInt();
//			if(!list.contains(a)) {
//				list.add(a);
//			}else {
//				list2.add(a);
//			}
//		}
		
		Set<Integer> set = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		for(int i=0;i<n;i++) {
			int a = in.nextInt();
			if(!set.contains(a)) {
				set.add(a);
			}else if(!set2.contains(a)){
				set2.add(a);
			}
		}
		
		System.out.println(set.size() + set2.size());
	}
	
}

