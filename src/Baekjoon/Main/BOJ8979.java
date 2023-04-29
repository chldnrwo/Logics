package Baekjoon.Main;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class BOJ8979{
	
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int k = in.nextInt();
		Medal[] medal = new Medal[n];
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int d = in.nextInt();
            medal[a - 1] = new Medal(a, b, c, d);
        }
        Arrays.sort(medal);
        for(int i=0;i<n;i++) {
        	medal[i].setRank(i+1);
        	//Medal m = medal[i];
        	//System.out.println(m.country+" "+m.gold+" "+m.silver+" "+m.bronze+" "+m.rank);
        }
        for(int i=0;i<n-1;i++) {
        	if(medal[i].gold == medal[i+1].gold
        			&&medal[i].silver == medal[i+1].silver
        			&&medal[i].bronze == medal[i+1].bronze) {
        		medal[i+1].setRank(medal[i].getRank());
        	}
        }
        for(int i=0;i<n;i++) {
        	if(medal[i].country == k) {
        		System.out.println(medal[i].getRank());
        		System.exit(0);
        	}
        }
		
	}
	//
	static class Medal implements Comparable<Medal>{
		int country;
		int gold;
		int silver;
		int bronze;
		int rank;
		
		public Medal(int country, int gold, int silver, int bronze) {
			this.country = country;
			this.gold = gold;
			this.silver = silver;
			this.bronze = bronze;
		}

		public int getRank() {
			return rank;
		}

		public void setRank(int rank) {
			this.rank = rank;
		}
		
		@Override
		public int compareTo(Medal o) {
			if(this.gold != o.gold) {
				return o.gold - this.gold;
			} else if(this.silver != o.silver) {
				return o.silver - this.silver;
			} else {
				return o.bronze - this.bronze;
			}
		}
	}
	
}
