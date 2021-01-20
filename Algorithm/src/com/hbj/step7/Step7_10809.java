// 모든 알파벳 : a b c d e f g h i j k l m n o p q r s t u v w x y z


package com.hbj.step7;

import java.util.Scanner;

public class Step7_10809 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String input = scan.next();
		
		String[] arr1 = {"a", "b" ,"c", "d","e", "f", "g", "h", "i", "j", "k", "l" ,"m","n", "o", "p", "q", "r", "s", "t", "u", "v" ,"w"
				, "x", "y", "z"};
		
		
		int[] arr2 = new int[arr1.length];
		
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = -1;
		}
		
		for(int i=0; i<input.length(); i++) {
			for(int z=0; z<arr2.length; z++) {
				if(input.subSequence(i, i+1).equals(arr1[z]) && arr2[z] == -1) {
					arr2[z] = i;
				}
			}
		}
		
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}

	}

}
