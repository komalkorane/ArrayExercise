package com.array;

import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {
		remove();
	}

	public static void remove() {
		int a[] = { 10, 20, 30, 40, 50, 10,20,30,30 };
		int b[] = new int[a.length];
		
		int k = 0;

		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
				}
			}
			if (count == 0) {
				b[k] = a[i];
				k++;
			}
		}
		int d[]=new int[k];
		  for(int i=0;i<d.length;i++) {
			  d[i]=b[i];
		  }
		System.out.println(Arrays.toString(d));
	}
}
