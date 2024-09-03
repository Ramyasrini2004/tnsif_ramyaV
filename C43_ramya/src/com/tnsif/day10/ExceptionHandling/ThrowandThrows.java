package com.tnsif.day10.ExceptionHandling;

public class ThrowandThrows {
	public static void main(String[] args) 
	{
		ThrowandThrows obj=new ThrowandThrows();
		obj.Show();
	}
	public void Demo() {
		int a=5/0;
		System.out.println(a);
	}
	public void Show() {
		try {
			Demo();
		}
		catch(Exception e){
			System.out.println("Exception---->"+e);
		}
		finally {
			System.out.println("Hello World!....");
		}
	}
}
