package com.hbj.step7_2;

import java.util.Scanner;

public class Step7_5622 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
	
		String str = scan.next();
		int result = 0;
		
		// 아스키코드 65가 A
		for(int i=0; i<str.length(); i++) {
			if(65 <= str.charAt(i) && str.charAt(i) <= 67) {
				result += 3;
			} else if(68 <= str.charAt(i) && str.charAt(i) <= 70) {
				result += 4;
			}  else if(71 <= str.charAt(i) && str.charAt(i) <= 73) {
				result += 5;
			}  else if(74 <= str.charAt(i) && str.charAt(i) <= 76) {
				result += 6;
			}  else if(77 <= str.charAt(i) && str.charAt(i) <= 79) {
				result += 7;
			}  else if(80 <= str.charAt(i) && str.charAt(i) <= 83) {
				result += 8;
			}  else if(84 <= str.charAt(i) && str.charAt(i) <= 86) {
				result += 9;
			}  else if(87 <= str.charAt(i) && str.charAt(i) <= 90) {
				result += 10;
			}  
		}
		
		System.out.println(result);
		
	}
}
