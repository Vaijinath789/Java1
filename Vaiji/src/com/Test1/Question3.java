package com.Test1;

public class Question3 {
	public static void show(int a) {
		int fact=1;
		for(int i=1;i<=a;i++) {
			fact=fact*i;
		}
		System.out.println("The factorie of = "+a+" is "+fact);
	}
	public static void main(String[] args) {
		int num=5;
		show(num);
	}

}
