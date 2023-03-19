import java.util.Scanner;

class Main{
	static int cnt;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int r = in.nextInt();
		int c = in.nextInt();
		cnt=0;
		int size = (int)Math.pow(2, n);
		bh(size, r, c);
		System.out.println(cnt);
		
	}
	public static void bh(int size, int r, int c) {
		if(size==1) {
			return;
		}
		if(r<size/2 && c<size/2) {
			bh(size/2, r, c);
		}else if(r<size/2 && c>=size/2) {
			cnt += size * size / 4;
			bh(size/2, r, c-size/2);
		}else if(r>=size/2 && c<size/2) {
			cnt += size * size / 4 * 2;
			bh(size/2, r-size/2, c);
		}else if(r>=size/2 && c>=size/2) {
			cnt += size * size / 4 * 3;
			bh(size/2, r-size/2, c-size/2);
		}
	}
}
//분할정복
//최대는 2^15 * 2^15