package com.hbj.step7_2;

import java.util.Scanner;

public class Step7_2675 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tn = scan.nextInt();
		String result = ""; 
		
		for(int i=0; i<tn; i++) {
			
			result = ""; 
			
			int num = scan.nextInt();
			String str = scan.next();
			
			for(int j=0; j<str.length(); j++) {
				for(int x=0; x<num; x++) {
					result += str.substring(j, j+1);
				}
			}
			
			System.out.println(result);
		}
	}

}
