package com.hbj.step7;

import java.util.Scanner;

public class Step7_2675 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int limit = scan.nextInt();
		String result = "";
		
		for(int j=0; j<limit; j++) {
			result = "";
			
			int num = scan.nextInt();
			String input = scan.next();
			
			for(int i=0; i<input.length(); i++) {
				for(int z=0; z<num; z++) {
					result += input.substring(i, i+1);
				}
			}
			
			System.out.println(result);
		}
		
	}

}
