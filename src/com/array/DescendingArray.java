package com.array;

import java.util.Arrays;

public class DescendingArray {

	public static void main(String[] args) {
		
		descending();
	}

	private static void descending() {
		int a[]= {20,30,10,40,50};
		int swap=0;
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					swap=a[i];
					a[i]=a[j];
					a[j]=swap;
				}
			}
		}System.out.println("Descending Order is ="+ Arrays.toString(a));
	}

}
