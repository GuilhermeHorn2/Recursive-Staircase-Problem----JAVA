package misc;

import java.util.HashMap;

public class main_misc2 {
	
	private static HashMap<Integer,Integer> cache = new HashMap<>();
	public static void main(String[] args) {
		// 
	System.out.println(climb(20));
	
	}
	/*
	 * I interpret this problem basically as:starting from 0 in how many ways can you sum up to n using 1 and 2
	 */
	private static int climb(int n) {
		
		//I will assume that the starting position is 0 and you to climb up to n
		
		if(n == 1) {
			return 1;
		}
		
		if(n == 2) {
			return 2;
		}
		if(cache.containsKey(n)) {
			return cache.get(n);
		}
		int s = 0;
		for(int i = 1;i <= 2;i++) {
			//
			int r = n-i;
			if(r >= 1) {
				s += climb(r);
			}
		}
		cache.put(n,s);
		return s;
	}
	
	
	}
	
	
