package Homework;

public class Whileloop {
	
	public static void main(String[] args) {
		
		int i = 4;
		int j = 2;
		int result = 0;
		
		while (i >= j) { // i = 2
			
			result = i % j;
			
			if (result != 0) {
				System.out.println(i+" % " +j+ " Module Result = "+result);
			}else {
				System.out.println(i+" % " +j+ " Module Result = "+result);
			}
			j++;			
		}
		
	}

}
