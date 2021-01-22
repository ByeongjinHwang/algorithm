package com.hbj.step7;

import java.util.Scanner;

public class Step7_5622 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		int sum = 0;
		
		for(int i=0; i<str.length(); i++) {
			if(65 <= (int)str.charAt(i) && 67 >= (int)str.charAt(i) ) {
				sum += 3;
			} else if(68 <= (int)str.charAt(i) && 70 >= (int)str.charAt(i)) {
				sum += 4;
			} else if(71 <= (int)str.charAt(i) && 73 >= (int)str.charAt(i)) {
				sum += 5;
			} else if(74 <= (int)str.charAt(i) && 76 >= (int)str.charAt(i)) {
				sum += 6;
			} else if(77 <= (int)str.charAt(i) && 79 >= (int)str.charAt(i)) {
				sum += 7;
			} else if(80 <= (int)str.charAt(i) && 83 >= (int)str.charAt(i)) {
				sum += 8;
			} else if(84 <= (int)str.charAt(i) && 86 >= (int)str.charAt(i)) {
				sum += 9;
			} else if(87 <= (int)str.charAt(i) && 90 >= (int)str.charAt(i)) {
				sum += 10;
			}
			
		}

		System.out.println(sum);
	}

}
