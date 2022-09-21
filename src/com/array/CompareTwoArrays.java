package com.array;

public class CompareTwoArrays {

	public static void main(String[] args) {
         compare();
	}

	public static void compare() {
		int a[]= {10,20,30,40,50};
		int b[]= {10,20,30,40,50};
		int count=0;
		
		for(int i=0; i<a.length; i++) {
			if( a[i] == b[i])
				count++;
		}
		if(count != 0)
			System.out.println("Exact match");
		else
			System.out.println("Not match");
	}
}
