import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int cnt = 0;
		while(n>0) {
			cnt+=n%2;
			n/=2;
		}
		System.out.println(cnt);
	}
}