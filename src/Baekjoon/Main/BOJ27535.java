package Baekjoon.Main;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class BOJ27535 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int H = in.nextInt();
		int T = in.nextInt();
		int C = in.nextInt();
		int K = in.nextInt();
		int G = in.nextInt();
		
		int t = in.nextInt();
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("H", H);
		map.put("T", T);
		map.put("C", C);
		map.put("K", K);
		map.put("G", G);
		
		for(int i=0;i<t;i++) {
			int h1 = in.nextInt();
			int t1 = in.nextInt();
			int c1 = in.nextInt();
			int k1 = in.nextInt();
			int g1 = in.nextInt();
			
			int h0 = map.get("H");
			int t0 = map.get("T");
			int c0 = map.get("C");
			int k0 = map.get("K");
			int g0 = map.get("G");
			int sumO = h0+t0+c0+k0+g0;
			
			h0-=h1;
			t0-=t1;
			c0-=c1;
			k0-=k1;
			g0-=g1;
			
			map.put("H", h0);
			map.put("T", t0);
			map.put("C", c0);
			map.put("K", k0);
			map.put("G", g0);
			
			int sum = h0+t0+c0+k0+g0;
			int ruler = sumO%10;
			
			List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());
			Collections.sort(entryList, (o1,o2)->{
				int comparision = (o2.getValue() - o1.getValue());
			    if (comparision == 0) {
			        return o1.getKey().compareTo(o2.getKey());
			    }
			    return comparision;
			});
			
			String b = Integer.toString(sum);
			if(!(ruler==0||ruler==1)) {				
				String s = "";
				while(sum!=0) {
					int a = sum % ruler;
					sum /= ruler;
					s=Integer.toString(a)+s;
				}
				if(s.equals("")) {
					b = "0";
				}else {					
					b = s;
				}
			}
			
			sb.append(b+"7H").append("\n");
			
			if(b.equals("0")) {
				sb.append("NULL");
			}else {
				for(int j=0;j<map.size();j++) {
					if(entryList.get(j).getValue()!=0) {
						String a = entryList.get(j).getKey();
						sb.append(a);
					}
				}
			}

			sb.append("\n");

			
		}
		System.out.println(sb);
	}
}
