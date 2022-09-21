package com.array;

import java.util.Arrays;

public class AdditionOfTwoArray {

	public static void main(String[] args) {
         addition();
	}
	
	public static void addition() {
		int a[]= {10,20,30,40,50};
		int b[]= {60,70,80,90,100};
		int c[]= new int[a.length];
		int j=0;
		
		for(int i=0; i<a.length; i++) {
			c[i]=a[i]+b[i];
			
		}
		
		System.out.println(Arrays.toString(c));
	}

}
