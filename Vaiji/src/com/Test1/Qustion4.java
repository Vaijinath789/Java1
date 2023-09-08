package com.Test1;

public class Qustion4 {
	public static void show(int[]a) {
		int result=0;
		for(int i=0;i<a.length-1;i++) {
			 result= result+a[i];
			if(result==11) {
				System.out.println("still index= "+i);
			}
			
		}
	}
	public static void main(String[] args) {
		int []arr= {2,3,6,4,9,0,11};
		show(arr);
	}

}
