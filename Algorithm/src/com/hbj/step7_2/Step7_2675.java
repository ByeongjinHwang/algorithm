package com.hbj.step7_2;

import java.util.Scanner;

public class Step7_2675 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tn = scan.nextInt();
		
		
		for(int i=0; i<tn; i++) {
			System.out.println();
			int num = scan.nextInt();
			String str = scan.next();
			for(int j=0; j<str.length(); j++) {
				for(int x=0; x<num; num++) {
					System.out.print(str.substring(j, j+1));
				}
			}
		}
	}

}
