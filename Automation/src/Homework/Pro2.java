package Homework;

import java.util.Scanner;

public class Pro2 {

	public static void main(String[] args) {
		
		int a,result;
		
		Scanner pro1 = new Scanner(System.in);
		System.out.print("Please enter the number of count : ");
		a = pro1.nextInt();
		result = avg(a);
		System.out.println(a+" Number of avarage = "+result);
		
	}
	static int avg(int x){
		int b = 0,c = 0, i = 1;
		while (i <= x) {
			Scanner pro1 = new Scanner(System.in);
			System.out.print("Input the first number: ");
			c = pro1.nextInt();
			b = b + c;
			i++;
		}
		int cul;
		cul = b / x;
		return(cul);
	}
}
