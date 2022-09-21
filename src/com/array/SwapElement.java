package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class SwapElement {

	public static void main(String[] args) {
         swap();
	}

	public static void swap() {
		int a[] = {10,20,30,40,50};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two index for swap");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int c=0;
		
		c= a[n1];
		a[n1]= a[n2];
		a[n2]=c;
		System.out.println(Arrays.toString(a));
		
	}
}
