package com.hbj.free;

import java.util.Scanner;

public class Star2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		for(int i=num-1; i>=0; i--) {
			for(int z=0; z<num; z++) {
				if(i <= z) {
					System.out.print("*");
				} else {
					System.out.print(" ");
					
				}
			}
			System.out.println();
		}

	}
}
