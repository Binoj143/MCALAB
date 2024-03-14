
import java.util.*;
public class Employeee{
	int Empid;
	String Name;
	float Salary;
	String Address;
	
	public Employeee(int id, String name,float salary, String address ) {
		this.Empid = id;
		this.Name = name;
		this.Salary = salary;
		this.Address = address;
		
	}
	
	
static class Teacher extends Employeee{
        String Department;
        String Subject;
       
        
        public Teacher(int id, String name, float salary, String address, String dept, String subj) {
        super(id, name, salary, address);
			
			
		this.Department = dept;
		this.Subject = subj;
			
			
		}


		public void Display() {
			
			System.out.println("\nId: "+Empid);
			System.out.println("Name: "+Name);
			System.out.println("Salary: "+Salary);
			System.out.println("Address: "+Address);
			System.out.println("Department: "+Department);
			System.out.println("Subject: "+Subject);
			
		}
		
	}
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,count, id_;
		float sal;
		String nam,adr,dep,sub;
		

		System.out.println("Enter the number of records to be stored:");
		count = sc.nextInt();
        
		Teacher[] e = new Teacher[count];
      
		
		for( i=0; i<count; i++)
			{
			
			   System.out.println("Enter the ID:");
			    id_= sc.nextInt();
			   System.out.println("Enter the name:");
			    nam= sc.next();
			   System.out.println("Enter the salary:");
			    sal= sc.nextFloat();
			   System.out.println("Enter the address:");
			    adr= sc.next();
			   System.out.println("Enter the department:");
			    dep= sc.next();
			   System.out.println("Enter the subject:");
			    sub= sc.next();
	        
			   e[i] = new Teacher(id_,nam,sal,adr,dep,sub);
			
			}
		System.out.println("\n______EMPLOYEE DETAILS_____");
		for( i=0; i<count; i++)
	        {
			   e[i].Display();
		    }
		
		
		
           
	}

}
