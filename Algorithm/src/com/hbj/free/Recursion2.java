package com.hbj.free;

import java.util.Scanner;

public class Recursion2 {

	public static void main(String[] args) {
		
		//팩토리얼
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.printf("1부터 %d까지의 합 : %d", num, sum(num));
		
	}

	public static int sum(int n) {
		
		if(n <= 1) {
			return 1;
		} 
		
		return n + sum(n-1);
	}
	
}
