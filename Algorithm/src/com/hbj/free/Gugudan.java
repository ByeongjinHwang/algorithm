package com.hbj.free;

import java.util.Scanner;

public class Gugudan {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		for(int i=0; i<=9; i++) {
			System.out.printf("%d * %d = %d \n", num, i, num*i);
			
		}
	}
}
