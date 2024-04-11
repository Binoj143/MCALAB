import java.util.*;
 class Person
{
    String name;
    String gender;
    String address;
    int age;
    Scanner sc=new Scanner(System.in);
  public Person()
{
    System.out.println("ENTER THE DETAILS");
    System.out.println("enter the name");
    name = sc.next();
    System.out.println("enter the gender");
    gender = sc.next();
    System.out.println("enter the address");
    address = sc.next();
    System.out.println("enter the age");
    age = sc.nextInt();
}  
}
class Employee extends Person
{
    int empid;
    String company_name;
    String qualification;
    int salary;
   Scanner em= new Scanner(System.in);
   public Employee()
   {
    System.out.println("enter the id");
    empid = em.nextInt();
    System.out.println("enter the company name");
   company_name = em.next();
    System.out.println("enter the qualification");
    qualification = em.next();
    System.out.println("enter monthly salary");
    salary = em.nextInt();
   } 
}
class Teacher extends Employee
{
    String subject;
    String department;
    int tid;
    Scanner tr = new Scanner(System.in);
    public Teacher()
    {
    System.out.println("emter the details of teacher");
    System.out.println("enter the subject");
    subject = tr.next();
    System.out.println("enter the department");
    department = tr.next();
    System.out.println("enter his id");
    tid = tr.nextInt();
    }
    public void display()
    {
   System.out.println("------Teacher details-------");
   System.out.println("The name:"+name);
   System.out.println("The gender:"+gender);
   System.out.println("The address:"+address);
   System.out.println("The age:"+age);
   System.out.println("employee id:"+empid);
   System.out.println("company_name:"+company_name);
   System.out.println("qualification:"+qualification);
   System.out.println("salary:"+salary);
   System.out.println("subject:"+subject);
   System.out.println("department:"+department);
   System.out.println("teacher id:"+tid);
    } 
}
 public class Inherit
 {
public static void main(String[] args)
 {
 Scanner te = new Scanner(System.in);
 int i;
 System.out.println("Enter number of teachers: ");
 int n=te.nextInt();
 Teacher t[]=new Teacher[n];
 for(i=0;i<n;i++) 
 {
    t[i]=new Teacher();
 }
 for(i=0;i<n;i++) 
 {
  t[i].display();
 }
  }
}
