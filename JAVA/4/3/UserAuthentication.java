
import java.util.Scanner;

class UserAuthException extends Exception {
		
		
		private static final long serialVersionUID = 1L;

		UserAuthException(String s){
			super(s);
		}

	}

public class UserAuthentication {

		public static void main(String[] args) {
			 String username, u_name, password,p_wrd;
			 
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Please provide a username and password. . ");
		        System.out.print("\nENTER USERNAME:");
		        username = sc.nextLine();
		        System.out.print("ENTER PASSWORD:");
		        password = sc.nextLine();
		        System.out.print("\nYou are successfully registered!! Please log in to continue. .");
		        System.out.print("\nENTER USERNAME:");
		        u_name = sc.nextLine();
		        System.out.print("ENTER PASSWORD:");
		        p_wrd = sc.nextLine();
		        sc.close();
		        try
		        {
		           authentication(username,password,u_name,p_wrd);
				    }catch(Exception e)
				      {
					       System.out.println("Exception Occurred. . "+e);
				      }
			

		}
		
		public static void authentication(String uname, String pwd, String u, String p) throws UserAuthException{
			
			 if((u=="") || (p=="")) {
				 throw new UserAuthException("Fields cannot be empty!!!");
			 }
			 else if(u.equals(uname) && p.equals(pwd)){
				 System.out.println("Authentication Successful!!!");
			 }
			 else if((u!=uname) || (p!=pwd)) {
				 throw new UserAuthException("Authentication Failed!! Please recheck!!!");
			 }
			
			 else {
				 System.exit(0);
			 }
	
    }

}



