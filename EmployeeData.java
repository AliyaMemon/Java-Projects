import java.util.*;
class Employee{    
    String name; 
    int yoj;
    String add;
    float salary;  
    void insert(String n,int y, String a, float s) {   
        name=n; 
        yoj=y;
        add=a;
        salary=s;  
    }  
    void display(){
    	System.out.println("Employee Data:\n" +name+" "+yoj+" "+add+" "+salary);
    }  
}  
public class EmployeeData {  
public static void main(String[] args) {  
    Employee e1=new Employee();  
    Employee e2=new Employee();  
    Employee e3=new Employee();  
    String nm;
    int yj;
    String ad;
    float sal;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter Employee data as asked:");
    System.out.print("Name:");
    nm=s.next();
    System.out.print("Year of Joining:");
    yj=s.nextInt();
    System.out.print("Address:");
    ad=s.next();
    System.out.print("Salary:");
    sal = s.nextFloat();
	e1.insert(nm,yj,ad,sal); 
	System.out.print("Name:");
    nm=s.next();
    System.out.print("Year of Joining:");
    yj=s.nextInt();
    System.out.print("Address:");
    ad=s.next();
    System.out.print("Salary:");
    sal = s.nextFloat();
	e2.insert(nm,yj,ad,sal); 
	System.out.print("Name:");
    nm=s.next();
    System.out.print("Year of Joining:");
    yj=s.nextInt();
    System.out.print("Address:");
    ad=s.next();
    System.out.print("Salary:");
    sal = s.nextFloat();
	e3.insert(nm,yj,ad,sal); 
    
    
    
	e1.display();  
    e2.display();  
    e3.display();  
	}  
}  