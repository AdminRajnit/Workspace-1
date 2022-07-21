package Homework;

import java.util.Scanner;

public class Class_pra1 {
	
	public static void main(String[] args) {
		
		System.out.print("Please Event two number :");
		
		//Calling 
		additon();
		subtraction();
	}
	static void additon() {
		
		int a, b;
		float result;
		Scanner insert = new Scanner(System.in);
		a = insert.nextInt();
		b = insert.nextInt();
		
		result = a + b;
		
		System.out.print(a+"+"+b);
		System.out.println(" = "+result);
	
	}
	static void subtraction() {
		
		int a, b;
		float result;
		Scanner insert = new Scanner(System.in);
		a = insert.nextInt();
		b = insert.nextInt();
		
		result = a - b;
		
		System.out.print(a+"-"+b);
		System.out.println(" = "+result);
	}
}

