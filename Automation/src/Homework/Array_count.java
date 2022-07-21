package Homework;

public class Array_count {
	
	public static void main(String[] args) {
		
		int nums[] = {2,4,3,4}; 
		
		for (int i = 0; i < nums.length; i++) {
			int count = 0;
			for (int j = 0; j < nums.length; j++) {
				
				if(nums[i] == nums[j])
				{
					count++;
				}
			}
			System.out.println(nums[i]+" = "+count);
		}
	
	}

}
