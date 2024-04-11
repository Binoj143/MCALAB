

import java.util.Scanner;
class NegInputException extends Exception {
	

	private static final long serialVersionUID = 1L;

	NegInputException(String s){
		super(s);
	}

}
public class avgException {

	public static void main(String[] args) {
		
	      int N;
	      float Sum = 0,avg;
	      Scanner sc=new Scanner(System.in);
	      System.out.println("Enter the number of inputs required:");
	      N = sc.nextInt();
	      float[] numbers = new float[N];
	      System.out.println("Start inputting the data:");
	      
	      for( int i=0; i < N ; i++)
	      { 
	    	  numbers[i]=sc.nextInt();
	    	  try{
	                if(numbers[i]<0)
	                 {
	                    throw new NegInputException("Negative inputs not allowed!");
	                 }
	                else
	                  {
	                    Sum += numbers[i];
	                    
	                  }
	                }catch(NegInputException e)
	                  {
	                    System.out.println("Exception Occurred. . "+e);
	                    System.exit(0);
	                  }
	        }
	       sc.close();
	       avg = Sum / N;     
	       System.out.println("Average = "+ avg);
	          
	   }
	         	
				
	}
           
