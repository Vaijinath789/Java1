package com.Test1;

public class Question2 {
	public static void show(int num) {
		int temp=0;
		while(num>0) {
			 int a=num%10;
			 temp=temp+(a*a*a);
			 num=num/10;
		}
		 System.out.println("It IS Armongroam ="+temp);
		 
	}
	public static void main(String[] args) {
		int num=153;
		show(num);
		
	}

}
