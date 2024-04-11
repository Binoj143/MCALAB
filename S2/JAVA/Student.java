import java.util.*;

class Student{
	int rollno;
	String Name;
	float sub1,sub2,sub3;

    Student(){
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Please input the student details. .\n");
    	System.out.println("Enter the Roll No:");
    		rollno = sc.nextInt();
    	System.out.println("Enter the Name:");
    		Name = sc.next();
    	System.out.println("\nInput the Subject marks. . \n");
    	System.out.println("Enter marks for Subject-1:");
    		sub1 = sc.nextFloat();
        System.out.println("Enter marks for Subject-2:");
    		sub2 = sc.nextFloat();
        System.out.println("Enter marks for Subject-3:");
    		sub3 = sc.nextFloat();

      }
 }


class Sports extends Student{
	String event1,event2;
    int score1,score2;

  Sports(){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("\nInput the Sports data. . \n");
	  System.out.println("Enter Event-1:");
	  event1 = sc.next();
	  System.out.println("Enter score:");
	  score1 = sc.nextInt();
	  System.out.println("Enter Event-2");
	  event2 = sc.next();
	  System.out.println("Enter score:");
	  score2 = sc.nextInt();
	  
	  sc.close();
    }
}
class Result extends Sports{
	void Display() {
		System.out.println("___STUDENT PROFILE___");
		System.out.println("Roll No: "+rollno);
		System.out.println("Name: "+Name);
		
		System.out.println("\n___ACADEMIC SCORE___");
		System.out.println("Subject-1 Marks: "+sub1);
		System.out.println("Subject-2 Marks: "+sub2);
		System.out.println("Subject-3 Marks: "+sub3);
    	System.out.println("TOTAL:"+(sub1+sub2+sub3));
    	
    	System.out.println("\n___SPORTS SCORE___");
    	System.out.println("Event-1: "+event1);
    	System.out.println("Score: "+score1);
    	System.out.println("Event-2: "+event2);
    	System.out.println("Score: "+score2);
    	System.out.println("TOTAL:"+(score1+score2));
  
     }
}
public class Score{

	public static void main(String[] args) {
		
		Result r = new Result();
		System.out.println("\n__________REPORT CARD________\n");
		r.Display();
		

	}

}
