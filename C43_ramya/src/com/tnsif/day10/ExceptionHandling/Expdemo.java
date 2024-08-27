package com.tnsif.day10.ExceptionHandling;

import java.util.Scanner;

public class Expdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter the number : ");
			int n = sc.nextInt();
			System.out.println(n%2==0?n+" "+"is Even":"is Odd");
			return;
		}
		catch(Exception e){
			System.out.println("Invalid input");
		}
		finally {
			System.out.println("In Finally...");
			sc.close();
		}
	}

}
