import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String N = in.next();
		int B = in.nextInt();
		int len = N.length();
		
		int sum=0;
		for(int i=len-1;i>=0;i--) {
			char a = N.charAt(i);
			int num;
			if(a-57>0) {
				num = a - 55; 
			}else {
				num = a - 48;
			}
			int z = (int) Math.pow(B, len-1-i);
			sum += num*z;
		}
		System.out.println(sum);
	}
}