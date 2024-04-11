import java.util.Scanner;

public class matrix_sum {
	public static void main(String args[])
	  {
	    int m, n, r, c;
	    Scanner in = new Scanner(System.in);

	    System.out.println("Enter the number of rows and columns of matrices:");
	    m = in.nextInt();
	    n = in.nextInt();

	    int first[][] = new int[m][n];
	    int second[][] = new int[m][n];
	    int sum[][] = new int[m][n];

	    System.out.println("Enter the elements of Matrix-1:");

	    for (r = 0; r < m; r++)
	      for (c = 0; c < n; c++)
	        first[r][c] = in.nextInt();

	    System.out.println("Enter the elements of Matrix-2:");

	    for (r = 0 ; r < m; r++)
	      for (c = 0 ; c < n; c++)
	        second[r][c] = in.nextInt();

	    for (r = 0; r < m; r++)
	      for (c = 0; c < n; c++)
	        sum[r][c] = first[r][c] + second[r][c];  

	    System.out.println("Sum of the two matrices:");

	    for (r = 0; r < m; r++)
	    {
	      for (c = 0; c < n; c++)
	        System.out.print(sum[r][c] + "\t");

	      System.out.println();
	    }
	  }
	}
