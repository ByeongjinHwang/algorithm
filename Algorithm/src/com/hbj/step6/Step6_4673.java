package com.hbj.step6;

public class Step6_4673 {
	
public static void main(String[] args) {
		
		boolean[] arr = new boolean[10001];
		
		for(int i=1; i<10001; i++) {
			int n = d(i);
			 
			if(n < 10001) {
				arr[n] = true;
			}
			
		}
		
		for(int z=1; z<10000; z++) {
			if(!arr[z]) {
				System.out.println(z);	
			}
		}
		
	}
	
	static int d(int num) {
		int sum = num;
		
		while(num != 0) {
			
			sum = sum + num%10;
			num = num/10;

		}
		
		return sum;
			
	}
}
