package Homework;

import java.util.Scanner;

public class Forloop {
	
	public static void main(String[] args) {
		
		int a = 10;
		int result;
		int tb;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please Enter your table number : ");
		
		tb = scanner.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			
			System.out.print(tb+" * ");
			System.out.print(i+" = ");
			System.out.println(result = i * tb);
			//System.out.println();

		}
		
	}

}
