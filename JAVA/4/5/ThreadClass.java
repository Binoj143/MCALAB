import java.util.Scanner;

class MulTable extends Thread{
  public void run() {
	int num = 5;
	System.out.printf("_____Multiplication Table of 5_____\n");
    for(int i = 1; i <= 10; ++i)
    {
    	System.out.printf("%d * %d = %d \n", num, i, num * i);
    }
  }
	
}

class PrimeNo extends Thread{
	public void run() {
	 int i, j,flag;
	 Scanner s = new Scanner(System.in);
	 System.out.println("\n_____To generate first N prime numbers_____");
	 System.out.println("Enter the limit (N):");
	 int N = s.nextInt();
	 
	    
	 System.out.println("Prime numbers between 1 and " + N + " are:");
	
	    for (i = 1; i <= N; i++)
	    {
	 
	        if (i == 1 || i == 0)
	            continue;
	 
	        flag = 1;
	 
	        for (j = 2; j <= i / 2; ++j)
	        {
	            if (i % j == 0)
	            {
	                flag = 0;
	                break;
	            }
	        }
	 
	        if (flag == 1)
	            System.out.print(i + " ");
	    }
	}
  }	


public class ThreadClass {

	public static void main(String[] args) throws InterruptedException {
		MulTable m = new MulTable();
		m.start();
		m.sleep(200);
		
		PrimeNo p = new PrimeNo();
		p.start();
		p.sleep(200);
		// TODO Auto-generated method stub

	}

}
