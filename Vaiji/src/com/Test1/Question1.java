package com.Test1;

public class Question1 {
	public static void palindrom(int num) {
		int store=0;
		while(num>0) {
			int a=num%10;
			store=a;
			num=num/10;
			System.out.print(store);
		}
//		if(num ==store) {
//			System.out.println("It is palindrom number");
//		}
//		else {
//			System.out.println("It is palindrom  not number");
//		}
	}
	public static void main(String[] args) {
		int num=1221;
		palindrom(num);
	}

}
