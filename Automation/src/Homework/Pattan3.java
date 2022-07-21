package Homework;

public class Pattan3 {
	
	int d = 5;
	
	public static void main(String[] args) {
		int c = 5;
		int r = 0;
		for (int i = 0; i <= c; i++) { //Row
			
			for (int j = 0; j < i; j++) {
				r = c - j;
				System.out.print(r);
			}	
			System.out.println();
		}

	}

}
