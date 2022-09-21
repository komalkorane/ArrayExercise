package com.array;

import java.util.Arrays;

public class AscendingArray {

	public static void main(String[] args) {

		ascending();
	}

	private static void ascending() {
		int a[]= {20,30,10,40,50};
		int swap=0;
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					swap=a[i];
					a[i]=a[j];
					a[j]=swap;
				}
			}
		}System.out.println("Ascending Order is ="+Arrays.toString(a));
	}

}