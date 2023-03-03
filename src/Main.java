import java.util.Scanner;

class Main{
	static int[][] arr;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int M = in.nextInt();
		arr = new int[N][N];
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				arr[i][j] = in.nextInt();
			}
		}
		
		
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}