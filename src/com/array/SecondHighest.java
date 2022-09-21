package com.array;

public class SecondHighest {

	public static void main(String[] args) {
		
		secondHighest();

	}

	private static void secondHighest() {
		int a[]= {20,30,50,40,10};
		int swap=0;
		int largeNum;
		
		  for(int i=0;i<a.length;i++) {
			  for(int j=i+1;j<a.length;j++) {
				  if(a[i]>a[j]) {
					swap=a[i];
					a[i]=a[j];
					a[j]=swap;
				  }
			  }
		  }  
		  largeNum=a[a.length-2];
		  System.out.println("Second Highest Number Is ="+ largeNum);
	}

}
