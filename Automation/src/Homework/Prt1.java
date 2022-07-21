package Homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Prt1 {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		int ch = 0;
		String value;
		while (ch!=5) {
			System.out.print(" 1.Add items \n 2.Remove Item \n 3.Update item \n 4.Show item.");
			System.out.println("Please event your choice : ");
			Scanner scanner = new Scanner(System.in);
			ch = scanner.nextInt();
			switch (ch) {
			case 1:
					System.out.println("Enter item name : ");
					value = scanner.next();
					list.add(value);
					System.out.println("Item has been added Successfully.");
					System.out.println(list);
			break;
			case 2:
					System.out.println("Enter item name : ");
					value = scanner.next();
					list.remove(value);
					System.out.println("Item has been remove Successfully.");
					System.out.println(list);
					
			break;
			case 3:
					System.out.println("Enter item name : ");
					value = scanner.next();
					System.out.println(list.size());
					
					list.set(0, "Cool");
					System.out.println("Item has been update Successfully.");
					System.out.println(list);
					
			break;
			case 4:
					

			break;
			case 5:
					

			break;

			default:
				
					System.out.println("Input is invalid!");
				
			break;
			}
			
		}
		
	}

}
