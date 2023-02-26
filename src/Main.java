import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Main {
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
			List<String> list = new ArrayList<>(map.keySet());
			
//			list.sort( (o1,o2)->{
//				if(map.get(o2)==map.get(o1)) {
//					
//				}else {
//					map.get(o2).compareTo(map.get(o1));
//				}
//			});
			
		}
		System.out.println(map);		
	}
}
