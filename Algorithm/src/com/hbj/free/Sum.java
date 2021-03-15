package com.hbj.free;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int result = 0;
		
		for(int i=1; i<=num; i++) {
			result += i;
			
		}
		
		System.out.print(result);
		
		
		
		
		
	}

}
