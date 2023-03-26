import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int d = in.nextInt();
		int e = in.nextInt();
		int f = in.nextInt();
		
		
		//(a*e - d*b)X = c*e - b*f
		int x = (c*e - b*f) / (a*e - d*b);
		int y = (c*d - f*a) / (b*d - a*e);
		
		System.out.println(x+" "+y);
	}
}