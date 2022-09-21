package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {

	public static void main(String[] args) {
		remove();
	}

	public static void remove() {
		
		int a[] = {10,20,30,40,50,60,70,80,90,100};
		int c[] = new int[a.length-1];
		int s=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any element from given array");
		int num = sc.nextInt();
		int b[] = new int [a.length-1];
	    int count=0;
		   
		for(int i=0; i<a.length; i++) {
			if( a[i] == num ) {
				count++;	
			} 
		}	
	     	if(count!=0) {
				for(int j=0; j<a.length; j++) {
					   if(a[j]!=num) {
						c[s]=a[j];
						s++;
					   }
				}
						
		} else 
			System.out.println("not present in arrays ="+num);
		
		if(count !=0)
			System.out.println(Arrays.toString(c));		
  }     
}