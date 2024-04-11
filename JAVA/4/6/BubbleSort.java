
import java.util.*;
public class BubbleSort {

	public static void main(String[] args) {
		    int num, i, j, temp;
		    Scanner s = new Scanner(System.in);
		 
		    System.out.println("Enter the number of integers to sort:");
		    num = s.nextInt();
		 
		    int array[] = new int[num];
		 
		    System.out.println("Enter any " + num + " integers: ");
		 
		    for (i = 0; i < num; i++) 
		    {
		    	 array[i] = s.nextInt();
		    }
		     
		 
		    for (i = 0; i < ( num - 1 ); i++) 
		    {
		      for (j = 0; j < num - i - 1; j++) 
		      {
		        if (array[j] > array[j+1]) 
		        {
		           temp = array[j];
		           array[j] = array[j+1];
		           array[j+1] = temp;
		        }
		      }
		    }
		 
		    System.out.println("Sorted list of integers:");
		 
		    for (i = 0; i < num; i++) 
		    {
		    	System.out.println(array[i]);	
		    }
		      
	

	}

}
