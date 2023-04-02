package Baekjoon.Main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

class BOJ20920{
	public static void main(String[] args) throws IOException {
		//Scanner in = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		Map<String, Integer> map = new HashMap<>();
		for(int i=0;i<N;i++) {
			String s = br.readLine();
			
			if(s.length()<M) {
				continue;
			}
			
			if(map.containsKey(s)) {
				Integer cnt = map.get(s);
				map.put(s, cnt+1);
			}else {
				map.put(s, 0);
			}
		}
		
		List<String> list = map.keySet().stream().collect(Collectors.toList());
		
		Collections.sort(list, (s1, s2)->{
			int o1 = map.get(s1);
			int o2 = map.get(s2);
			
			if(o1==o2) {
				if(s1.length() == s2.length()) {
					return s1.compareTo(s2);
				}
				return s2.length() - s1.length(); 
			}
			
			return o2 - o1;
		});
		
		for(String s : list) {
			sb.append(s).append("\n");
		}
		System.out.println(sb);
	}
	
}
