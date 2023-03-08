import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		
		int cnt=0;
		while(true) {
			if(a%2==0) {
				a/=2;
			}else {
				a = a/2+1;
			}
			
			if(b%2==0) {
				b/=2;
			}else {
				b = b/2+1;
			}
			cnt++;
			
			if(a==b) {
				break;
			}
			
		}
		System.out.println(cnt);
		
	}
	
}