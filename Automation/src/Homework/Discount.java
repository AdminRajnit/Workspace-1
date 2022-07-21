package Homework;

class Product1{
	
	int pid;
	String name;
	String details;
	int MRP;
	int discount;
	float salesPrice;
	
	void showProduct()
	{
		
		System.out.println("Product ID = "+pid);
		System.out.println("Product Name = "+name);
		System.out.println("Product Detaisls = "+details);
		System.out.println("Product MRP = "+MRP);
		System.out.println("Sales Price = "+salesPrice);
	}
	
	int getshow(int x,int y,int z) 
	{
		z = x - y ;
		return z;
	}
	
}


public class Discount {

	public static void main(String[] args) {
		
	   Product1 p1 = new Product1();
	   p1.pid = 1;
	   p1.name = "Smart Iphone 13";
	   p1.details = "Iphone 13 Max Pro.Ultra 264 - ROM and 12 GB RAM";
	   p1.MRP = 125000;
	   p1.discount = 5000;
	   
	   p1.salesPrice = (p1.MRP - p1.discount);
	   
	   int a, b, c;
	   a = p1.MRP;
	   b = p1.discount;
	   c = 0;
	   p1.showProduct();
	   float res = p1.getshow(a, b, c);
	   
	   System.out.println("Notes: Your discount is Rs."+p1.discount+ " and your final sales price is Rs." +res);
	}
	
	
}
