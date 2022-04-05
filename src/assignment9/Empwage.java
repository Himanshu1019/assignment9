package assignment9;
import java.util.Random;
import java.util.Scanner;

 class Account {
	

	public void calculate()
	{
		Random r=new Random();
		int a=r.nextInt(2);
		
		
		if(a==1)
		{
			System.out.println("yes the employee is present");
			System.out.println("***************************************************");
			
			}
		else 
		{
			System.out.println("the employee is absent");
			System.out.println("***************************************************");
		}

		}
	public void dailywage()
	{
		int hour=8;
		int wage=20;
	int	total=wage*hour;
	System.out.println("the daily wage of the employee is\n"  +total);
	System.out.println("***************************************************");
	}
	public void monthlywage()
	{
		Scanner s = new Scanner(System.in);
	      System.out.println("please enter number of  working days in a month");
	    int month  = s.nextInt();	
	    System.out.println("please enter  wages per day");
	    int days  = s.nextInt();	
		
		int total=month*days;
		 System.out.println("the total wage for a given month is "+total);
		 System.out.println("***************************************************");
	}
	
	public void partemp()
	{
		Scanner s = new Scanner(System.in);
	      System.out.println("please enter part time wage");
	    int wage  = s.nextInt();	
		int hour=8;
		int total=wage *hour;
		 System.out.println(total);
		 System.out.println("***************************************************");
	}
}	
 public class Empwage {
		
		public static void main(String[] args) 
		{
			
		Account a=new Account();
		a.calculate();
		a.dailywage();
		a.partemp();
		a.monthlywage();	

		}

	}