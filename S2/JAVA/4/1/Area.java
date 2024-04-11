package GraphicS;

import java.util.Scanner;

interface figures{
	void rectangle();
	void triangle();
	void square();
	void circle();
}
public class Area implements figures {
	Scanner s = new Scanner(System.in);
	
	public void rectangle() {
		System.out.println("Enter the length:");
		int l = s.nextInt();
		
		System.out.println("Enter the breadth:");
		int b = s.nextInt();
		
		System.out.println("Area of the rectangle:"+(l*b));
	}
	

	public void triangle() {
		System.out.println("Enter the base:");
		int base = s.nextInt();
		
		System.out.println("Enter the height:");
		int h = s.nextInt();
		
		System.out.println("Area of the triangle:"+(0.5*base*h));
		
	}
	
	public void square() {
		System.out.println("Enter the side:");
		int side = s.nextInt();
		
		System.out.println("Area of the square:"+(side*side));
		
	}
	
	public void circle() {
		System.out.println("Enter the radius:");
		float r = s.nextFloat();
		
		System.out.println("Area of the circle:"+(Math.PI*r*r));
	}

}
