package Homework;

import java.util.Scanner;

public class Assignment1 {
	
	public static void main(String[] args) {
		
		System.out.println("1. Left Triangle");
		System.out.println("2. Right Triangle");
		System.out.println("3. Pyramind Program");
		System.out.println("4. Downward Triangle");
		System.out.println("5. Right down mirror");
		
		System.out.print("Please event your choice : ");
		int ch;
		Scanner scanner = new Scanner(System.in);
		ch = scanner.nextInt();
		
		switch (ch) {
		case 1:
				System.out.println(" WAP Left Triangle");	// WAP Left Triangle
				for (int i = 1; i <= 5; i++) {
					
					for (int j = 5; j > i; j--) {
						
						System.out.print(" ");
						}
					for (int k = 1; k <= i; k++) {
							
						System.out.print("*");
							
						}
					System.out.println("");
				}
			
		break;
		case 2:
				System.out.println(" WAP Right Triangle");	// WAP Right Triangle
				for (int i = 1; i <= 5; i++) { //Row
				
					for (int j = 1; j <= i; j++) {
						
						System.out.print("*");
					}	
					System.out.println();
				}
		
		break;
		case 3:
				System.out.println(" WAP Pyramind Program");	// WAP Pyramind Program
				for (int i = 1; i <= 5; i++) {
					
					for (int j = 5; j > i; j--) {
						
						System.out.print(" ");
						}
					for (int k = 1; k <= i; k++) {
							
						System.out.print("* ");
							
						}
					System.out.println("");
				}
				
		break;
		case 4:
				System.out.println(" WAP Downward Triangle Program");	// WAP Downward Triangle Program
				for (int i = 1; i <= 5; i++) { //Row
					
					for (int j = i; j <= 5; j++) {
						
						System.out.print("*");
					}	
					System.out.println();
				}

		break;
		case 5:
				System.out.println(" WAP Right down mirror Program");	// WAP Right down mirror Program
				int r = 5;
				
				for (int i = r; i >= 1; i--) {
					
					for (int j = r; j > i ; j--) {
						
						System.out.print(" ");
					}
					for (int k = 1; k <= i; k++) {
						
						System.out.print("* ");
					}
					System.out.println();
					
				}

		break;

		default:
			
				System.out.println("Input is invalid!");
			
		break;
		}
	}

}
