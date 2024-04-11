
import java.util.Scanner;

class Fibonacci implements Runnable{
	public void run(){
		int first = 0, second = 1, next;
		Scanner sc= new Scanner(System.in);
		System.out.println("___TO GENERATE FIBONACCI SERIES____");
		System.out.println("Enter the no.of terms required:");
		int n=sc.nextInt();
		
		System.out.println("Series Generated!!!");
		for (int i = 1; i <= n; ++i){
			System.out.print(first + "  ");
		    next = first + second;
			first = second;
			second = next;
           }
		}
   }

class EvenNo implements Runnable{
	public  void run(){
		Scanner sc= new Scanner(System.in);
		int lower, upper;
		System.out.println("\n\n_____TO GENERATE EVEN NUMBERS OF GIVEN RANGE_____");
		System.out.println("Enter the lower limit:");
		lower=sc.nextInt();
		
		System.out.println("Enter the upper limit:");
		upper=sc.nextInt();
		
		System.out.println("Even numbers from " + lower + " and " + upper + " are:");
		for (int i = lower; i <= upper; i++){
	        if (i%2!=0)
	            continue;
	        
	       else 
	            {
	              System.out.print(i+" ") ; 
	            }
        }
      }
  }


public class ThreadRunner {
	public static void main(String arg[]) throws InterruptedException
	{
	Fibonacci obj1 = new Fibonacci();
	Thread a=new Thread(obj1);
	a.start();
	a.sleep(2000);
	EvenNo obj2 = new EvenNo();
	Thread b= new Thread(obj2);
	b.start();
	b.sleep(1000);
	
	}
}
