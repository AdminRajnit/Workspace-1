package Homework;

import java.util.Scanner;

public class Pro1 {
	
	public static void main(String[] args) {
		
		int a, b, c;
		
		Scanner pro1 = new Scanner(System.in);
		
		System.out.println("Input the first number: ");
		a = pro1.nextInt();
		System.out.println("Input the Second number: ");
		b = pro1.nextInt();
		System.out.println("Input the third number: ");
		c = pro1.nextInt();
		
		Program1(a, b, c);
		
	}
	static void Program1(int x,int y,int z) {
				
			if (x < y) 
			{
				if (y > z) 
				{
					System.out.println("Second number is largest "+y);
				}else {
					System.out.println("Third number is largest "+z);
				}
				
			} else if (x < z) 
			{
				System.out.println("Third number is largest "+z);
			} else 
			{
				System.out.println("First number is largest "+x);
			}
			
		}

}
