package com.array;

public class AverageOfArray {

	public static void main(String[] args) {
            average();
	}

	public static void average() {
		int a[]= {10,20,30,40,50};
		int sum=0;
		
		for(int i=0; i<a.length; i++) {
			sum = sum+a[i];
			
		}
		double avg = sum/a.length;
		System.out.println("Average is :"+avg);
	}
}
