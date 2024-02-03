package OOPS.inheritance;

import java.util.Scanner;

class Employee
{
      String Ename;
      int salary;
      String city;

      String getname()
      {
          return Ename;
      }
      int getsalary()
      {
          return salary;
      }
      String getcity()
      {
          return city;
      }

   }

public class demo_emp {
    
           
        public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);

           Employee e1=new Employee();
           Employee e2=new Employee();

           System.out.println("enter employee name:");
           e1.Ename=sc.next();
           
           System.out.println("enter the salary:");
           e1.salary=sc.nextInt();

           System.out.println("enter the city:");
           e1.city=sc.next();

           System.out.println("\n");
           System.out.println("Ename:"+e1.getname());
           System.out.println("Salary:"+e1.getsalary());
           System.out.println("City:"+e1.getcity());
           
           System.out.println("second employee details:");
           System.out.println("enter employee name:");
           e2.Ename=sc.next();
           
           System.out.println("enter the salary:");
           e2.salary=sc.nextInt();

           System.out.println("enter the city:");
           e2.city=sc.next();

           System.out.println("\n");
           System.out.println("Ename:"+e2.getname());
           System.out.println("Salary:"+e2.getsalary());
           System.out.println("City:"+e2.getcity());
 
           sc.close();

        }
}
