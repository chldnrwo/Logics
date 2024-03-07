import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		String s = in.next();
		int cnt = 0;
		for(int i=0;i<n;i++) {
			String s2 = in.next();
			int t = in.nextInt();
			String[] sarr = s2.split("_");
			boolean check = false;
			for(int j=0;j<sarr.length;j++) {
				if(sarr[j].equals(s)) {
					check = true;
					
				}
				
			}
			if(check) {
				cnt+=t;
			}
		}
		System.out.println(cnt);
		//new link git hub test
	}
}