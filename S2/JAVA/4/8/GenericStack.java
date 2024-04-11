
import java.util.*;


 class StackOperations {
	int a[] = new int[20];
	int top = -1, choice, item, i;
	Scanner sc= new Scanner(System.in);
	
	public void push(int n) {
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - -");
		
		if(top>=n-1) {
			      System.out.println("Stack OVERFLOW!!!!!!");
			}
		else {
			      System.out.println("\nEnter the item to be pushed : ");
			      item=sc.nextInt();
            top=top+1;
            a[top]=item;

		}	
	}
	public void pop() {
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - -");
		
		if(top==-1) {
		       	System.out.println("\nStack UNDERFLOW!!!!!!");
			}
			else{	
				    item = a[top];
		        System.out.println("Popped item is:" +item);
		        top = top-1;
				}
	}
	public void Display() {
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - -");
		if( top < 0)
        {
			   System.out.println("\nStack is EMPTY!!!!!!\n");      
      }
		
		else {
		       System.out.println("\nStack Elements :\n");
           for(i=top;i>=0;i--)
           {
        	   System.out.println(a[i]);
           }
           
		   }
  	}
		
}


public class GenericStack {

	public static void main(String[] args) {
		  Scanner s = new Scanner(System.in);
			int ch,N;
			boolean input = true;
			StackOperations stack = new StackOperations();
			System.out.println("\nEnter the Stack size:");
			N = s.nextInt();

			while(input == true)
			{
			System.out.println("\n______S T A C K   O P E R A T I O N S ______");
			System.out.println("\n1.PUSH\t\t2.POP\n3.DISPLAY\t4.Exit");
			System.out.println("\nEnter your choice(1-4):");
			
			ch = s.nextInt();
			switch(ch)
			{
			case 1: stack.push(N);
			        break;
			        
			case 2: stack.pop();
			        break;
			        
			case 3: stack.Display();
			        break;
          
			case 4: System.out.println("\nEXITING . . "); 
				      System.exit(0);
          
			default:System.out.println("\nPlease Enter a Valid Choice!!");
		 	}
		
     }
			
		

  }

}
