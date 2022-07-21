package Homework;

import java.util.Scanner;

public class DecisionStatement3 {
	
	public static void main(String[] args) {

		char ah = 'a', ch;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please Enter you Alphabat : ");
		
		ch = scanner.next().charAt(0); 
		
		System.out.println("Alphabat is: " +ch);  
		
			if (ch == ah) {
				
				System.out.println("vowel letters is: " +ah);  
				
			}else {
				
				System.out.println("Is not vowel letters");
			}
			
	    }
	
}
