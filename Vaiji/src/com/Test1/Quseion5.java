package com.Test1;

public class Quseion5 {
	public static void v(int[]a) {
		int temp =a[a.length-1];
		for(int i=(a.length-1);i>0;i--) {
			a[i]=a[i-1];
		}
		a[0]=temp;
		for(int data:a) {
			System.out.print(data);
		}
		
	}
	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5};
		v(arr);
	}

}
