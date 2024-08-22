package com.tnsif.day6.Inheritance;

public class Inher {
	public static class A
	{
	public void Show() 
	{
		System.out.println("I'am a Parent");
	}
}
public static class A1 extends A
{
	public void Demo()
	{
		System.out.println("I'am a Child");
	}
}
public static void main(String[] args) 
{
	A1 obj = new A1();
	obj.Demo();
	obj.Show();
}
}
