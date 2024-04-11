import java.util.*;
public class symmetric {
	  public static void main(String[] args) { 
	  int r,c;
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter the no. of rows and columns:");
	  r=s.nextInt();
	  c=s.nextInt();
	  int[][]  a=new int[r][c];
	  int[][]  b=new int[r][c];

	  System.out.println("Enter the matrix elements");
	  for(int i=0;i<r;i++)
	  {
	    for(int j=0;j<c;j++)
	    {
	      a[i][j]=s.nextInt();
	    }
	  }
	 if(r==c) 
	 {  
	  for(int i=0;i<r;i++)
	  {
	    for(int j=0;j<c;j++) 
	    {
	      b[i][j]=a[j][i];
	    }
	  }
	 }
	  System.out.println("The matrix transpose is:");
	  for(int i=0;i<r;i++)
	  {
	    for(int j=0;j<c;j++) 
	    
	    	System.out.print(b[i][j] + "\t");
	    
		      System.out.println();
	    
	  }

	 int x=0;
	 for(int i=0;i<r;i++) 
	   for(int j=0;j<c;j++) 
	     if(a[i][j]!=b[i][j])
	       {
	    	 x=1;
	    	 break;
	       }
	if(x!=1)
	  System.out.println("YES! It is SYMMETRIC");
	else
	  System.out.println("NO! It is NOT SYMMETRIC");
	  
	     }
	  
	}
