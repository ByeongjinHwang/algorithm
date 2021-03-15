package com.hbj.free;

import java.util.Scanner;

public class Recursion {

	public static void main(String[] args) {
		
		//팩토리얼
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.printf("%d의 팩토리얼 값 : %d", num, factorial(num));
		
	}

	public static int factorial(int n) {
		
		if(n <= 1) {
			return 1;
		} 
		
		return n * factorial(n-1);
	}
	
}
