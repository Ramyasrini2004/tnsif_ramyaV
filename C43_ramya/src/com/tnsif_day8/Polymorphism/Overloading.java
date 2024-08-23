package com.tnsif_day8.Polymorphism;

public class Overloading {
	int num1;
	int num2;
	int result;
	
	//we need to store the num values in a and b
	void sum(int a,int b) {
		num1=a;
		num2=b;
		result=num1+num2;
		
		System.out.println("The results are: "+ result);
	}
	void sum(int a,double b) {
		num1=a;
		num2=(int)b;
		result=num1+num2;
		
		System.out.println("The results are: "+ result);
	}
	void sum(double a,double b) {
		num1=(int)a;
		num2=(int)b;
		result=num1+num2;
		
		System.out.println("The results are: "+ result);
	}
	public static void main(String[] args)
	{
		int a=10;
		int b=20;
		Overloading obj=new Overloading();
		obj.sum(a,b);
	}

}
