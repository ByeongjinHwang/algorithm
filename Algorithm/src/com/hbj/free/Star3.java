package com.hbj.free;

public class Star3 {

	public static void main(String[] args) {
		
		for(int i=0; i<4; i++) {
			
			for(int z=0; z<3-i; z++){
				System.out.print(" ");
			}
			
			for(int z=0; z<2*i+1; z++){
				System.out.print("*");
			}
			
			System.out.println();
			
					}

	}
}
