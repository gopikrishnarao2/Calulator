package com.spec.Feb01project;

public class Calculator {
	
	public void divide(float a,float b) {
	     float c=a/b;
		System.out.println(c);
	}
	
     public void divide(int a,int b) {
		if(b==0)
		  throw new ArithmeticException();
		else {
			int c=a/b;
		System.out.println(c);
 	}   
     }
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		try {
		cal.divide(45, 0);
		}catch(ArithmeticException ae) {
			ae.printStackTrace();
		}
		System.out.println("hello..");
	}

}
