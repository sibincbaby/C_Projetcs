//package main;
import java.util.*;

class Faculty
  
{
	int baseSalary;
  public void salary(int a)
  {
    this.baseSalary=a;
    System.out.println("Base Salary: "+baseSalary);
  }
}
class CSE extends Faculty
{
  public void salary(int a)
  {
	  int bonus=3000;
    System.out.println("CSE Faculty: "+(bonus+a));
  }
}
class IT extends Faculty
{
  public void salary(int a)
  {
	  int bonus=5000;
	    System.out.println("IT Faculty: "+ (bonus+a));
  }
}
class ECE extends Faculty
{
  public void salary(int a)
  {
	  int bonus=4500;
	    System.out.println("ECE Faculty: "+ (bonus+a));
  }
}

class Main
{
  public static void main(String[] args)
  {
    int base=0;
    Scanner sc = new Scanner(System.in);
    base = sc.nextInt();
    
    Faculty fac = new Faculty();
    fac.salary(base);
    
    CSE cse = new CSE();
    IT it = new IT();
    ECE ece = new ECE();
    
    
    
    
    cse.salary(fac.baseSalary);
    it.salary(fac.baseSalary);
    ece.salary(fac.baseSalary);
    
    
    //implement your required concept here
  }
}