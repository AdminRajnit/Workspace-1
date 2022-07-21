package Homework;

class Shape1
{

	
	void area(int l, int w) 
	{
		
		float area = l * w;
		System.out.println("area of rectangle "+area);
	}
	void area(int r) 
	{
		float area = r*r;
		System.out.println("area of square  "+area);
		
	}
	
}
public class Shape {
	
	public static void main(String[] args) {
		
		Shape1 p1 = new Shape1();
		   p1.area(1, 2);
		   p1.area(3);
	}

}

