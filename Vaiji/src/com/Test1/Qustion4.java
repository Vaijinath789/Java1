package com.Test1;

public class Qustion4 {
	public static void show(int[]a,int num) {
		for(int i=0;i<a.length;i++) {
			int result=a[i];			
			for(int j=i+1;j<a.length;j++) {
				result=result+a[j];	
				if(result==num) {
					System.out.println(""+i+","+j+"");
				}
			}
		}
			
	}
	
	public static void main(String[] args) {
		int []arr= {2,3,6,4,9,0,11};
		int num=11;
		show(arr,num);
	}

}
