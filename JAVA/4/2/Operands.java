package ArithmeticPackage;


interface Operations{
	void add();
	void sub();
	void div();
	void mul();
}


public class Operands implements Operations {
	float x,y;
	
	public Operands(float a, float b) {
		
		x=a;
		y=b;
		
	}
	
	public void add() {
		System.out.println("\nSUM="+(x+y));
	}
	
	public void sub() {
		System.out.println("\nDIFFERENCE="+(x-y));
	}
	
	public void div() {
		System.out.println("\nQUOTIENT="+(x/y));
	}
	
	public void mul() {
		System.out.println("\nPRODUCT="+(x*y));
	}
	
	
}
