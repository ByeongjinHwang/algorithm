package com.hbj.step7;

import java.util.Scanner;

public class Step7_1152 {

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			String input = scan.nextLine();
			String[] arr = input.split("\\s");
			
			
			if(input.substring(0, 1).equals(" ")) {
				System.out.println(arr.length-1);
				if(input.substring(input.length()-1, input.length()).equals(" ")) {
					System.out.println(arr.length-1);
				}
			} else if(input.substring(input.length()-1, input.length()).equals(" ")){
				System.out.println(arr.length);
			} else {
				System.out.println(arr.length);
			}
			
			

	}

}
