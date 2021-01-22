package com.hbj.step7;

import java.util.Scanner;

public class Step7_2908 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str_1 = scan.next();
		String str_2 = scan.next();
		
		String rStr_1 = str_1.substring(2, 3) + str_1.substring(1, 2) + str_1.substring(0, 1);
		String rStr_2 = str_2.substring(2, 3) + str_2.substring(1, 2) + str_2.substring(0, 1);
		
		if(Integer.parseInt(rStr_1) > Integer.parseInt(rStr_2)) {
			System.out.println(rStr_1);
		} else {
			System.out.println(rStr_2);
		
		
	}

}
}
