import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		long a = in.nextLong();
		long b = in.nextLong();
		
		long c = eucd(a, b);
		
		a /= c;
		b /= c;
		
		System.out.println(a*b*c);
	}
	
	public static long eucd(long a,long b) {
		long r = a%b;
		if(r==0) {
			return b;
		}else {
			return eucd(b, r);
		}
	}
}