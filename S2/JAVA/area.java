import java.util.*;

public class areaComputer {
	int a;
	int area;
	float x;
	double y;
	
	void area(int l,int b) {
		int length = l;
		int breadth = b;
		a=length*breadth;
		System.out.println("->Area: "+a);
	}
	
	void area(int s) {
		int side = s;
		area = side * side;
		System.out.println("->Area: "+area);	
	}
	
	void area(float b, float h) {
		float base = b;
		float height =h;
		x = (base*height)/2;
		System.out.println("->Area: "+x);			
	}
	
	void area(double r) {
	    double radius = r;
		y = 3.14*radius*radius;
		System.out.println("->Area: "+y);	
	}
	
	
public static void main(String[] args)	{
	areaComputer obj = new areaComputer();
	Scanner sc = new Scanner(System.in);
	System.out.println("***** Area of different shapes using overloaded functions *****");
	System.out.println("\n____RECTANGLE____");
	System.out.println("->Enter the length and breadth:");
	int l = sc.nextInt();
	int b = sc.nextInt();
	obj.area(l,b);
	System.out.println("\n____SQUARE____");
	System.out.println("->Enter the side:");
	int s = sc.nextInt();
	obj.area(s);
	System.out.println("\n____TRIANGLE____");
	System.out.println("->Enter the base and height:");
	float base = sc.nextFloat();
	float h= sc.nextFloat();
	obj.area(base,h);
	System.out.println("\n____CIRCLE____");
	System.out.println("->Enter the radius:");
	double r = sc.nextDouble();
	obj.area(r);
	sc.close();
  }
	
}
