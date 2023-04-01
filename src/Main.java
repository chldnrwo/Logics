import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Set<String> set = new HashSet<>();
		set.add("ChongChong");
		int t = in.nextInt();
		for(int i=0;i<t;i++) {
			String a = in.next();
			String b = in.next();
			
			if(set.contains(a)) {
				set.add(b);
			}else if(set.contains(b)) {
				set.add(a);
			}
		}
		
		System.out.println(set.size());
	}
}
