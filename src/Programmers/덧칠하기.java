package Programmers;

import java.util.Arrays;

public class 덧칠하기 {
	public static int solution(int n, int m, int[] section) {
	    int[] arr = new int[n];
	    int[] arr2 = new int[n];
	    
	    for(int i=0;i<section.length;i++) {
	    	arr[section[i]-1] = 1;
	    	arr2[n-section[i]] = 1;
	    }
	    //System.out.println(Arrays.toString(arr));
	    //System.out.println(Arrays.toString(arr2));
	    
	    int cnt1 = 0;
	    for(int i=0;i<n;i++) {
	    	if(arr[i]==1) {
	    		paint(i, m, n,arr);
	    		cnt1++;
	    	}
	    }
	    
	    int cnt2 = 0;
	    for(int i=0;i<n;i++) {
	    	if(arr2[i]==1) {
	    		paint(i, m, n,arr2);
	    		cnt2++;
	    	}
	    }
	    
		int answer = Math.min(cnt1, cnt2);
	    return answer;
	}
	public static void paint(int i,int m, int n, int[] arr) {
		for(int k=i;k<Math.min(i+m, n);k++) {
			arr[k] = 0;
		}
	}
	
	public static void main(String[] args) {
		int n = 8;
		int m = 4;
		int[] section = {2,3,6};
		solution(n, m, section);
	}
}
