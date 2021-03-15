package com.hbj.free;

public class SelectionSort {

	public static void main(String[] args) {
		
		int min;
		int temp;
		
		int[] arr = {10, 5, 12, 7};
		
		for(int i=0; i<arr.length-1; i++) {
			min = i;
			for(int z=i+1; z<arr.length; z++) {
				if(arr[min] > arr[z]) {
					min = z;
				}
				
				if(min != i) {
					 temp = arr[min];
					 arr[min] = arr[i];
					 arr[i] = temp;
				}
				
				
			}

		}
		
		for(int val : arr) {
			System.out.println(val + " ");
		}

	}
}
