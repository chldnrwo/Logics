package Baekjoon.Main;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class BOJ7785{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int t = in.nextInt();
		
		Map<String, String> map = new HashMap<>();
		
		for(int i=0;i<t;i++){
			String a = in.next();
			String b = in.next();
			map.put(a, b);				
		}
		
		List<String> list = new ArrayList<>();
		for(Map.Entry<String, String> entry : map.entrySet()) {
			if(entry.getValue().equals("enter")) {
				list.add(entry.getKey());
			}
		}
		
		Collections.sort(list);
		//System.out.println(list);
		
		for(int i=list.size()-1;i>=0;i--) {
			sb.append(list.get(i)).append("\n");
		}
		
		System.out.println(sb);
	}
}