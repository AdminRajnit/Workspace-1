package Homework;

public class Array_min_max {

	public static void main(String[] args) {
		
		int num[] = {1,9,1,5};
		
		int min = num[0];
		int max = num[0];
		
		for (int j : num) {
			
			if (j < min) { // 1 < 1 = false, 9 < 1 = false, 1 < 1 = true, 5 < 1 = false;
				
				min = j; // min = 1; 
				
			}
			if (j > max) { // 1 > 1 = false, 9 > 1 = true, 1 > 9 = false, 1 > 9 = false;
				
				max = j; // max = 9; 
				
			}
		}
		System.out.println("Minimum values is : "+min);
		System.out.println("Maximum values is : "+max);
	}
}
