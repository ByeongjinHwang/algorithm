package com.hbj.step7_2;

import java.util.Scanner;

public class Step7_2941 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		
		String replace1 = str.replace("c=", "1");
		String replace2 = replace1.replace("c-", "1");
		String replace3 = replace2.replace("dz=", "1");
		String replace4 = replace3.replace("d-", "1");
		String replace5 = replace4.replace("lj", "1");
		String replace6 = replace5.replace("nj", "1");
		String replace7 = replace6.replace("s=", "1");
		String replace8 = replace7.replace("z=", "1");
		
		System.out.println(replace8.length());
		
		
		
	}

}
