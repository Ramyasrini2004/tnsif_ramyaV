package com.tnisf.day9.Interfaces.WrapperClassesr;


interface one{
	int age=20;
	public void show();
}

class two implements one{
	@Override
	public void show() {
		System.out.println("Interface method one");
		System.out.println("Age:"+age);
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		two obj=new two();
		obj.show();
	}

}
