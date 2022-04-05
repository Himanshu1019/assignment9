package assignment9;
import java.util.Random;

 class Account {
	

	public void calculate()
	{
		Random r=new Random();
		int a=r.nextInt(2);
		
		
		if(a==1)
		{
			System.out.println("yes the employee is present");
			
			}
		else 
		{
			System.out.println("the employee is absent");
		}

		}
	public void dailywage()
	{
		int hour=8;
		int wage=20;
	int	total=wage*hour;
	System.out.println("the daily wage of the employee is\n"  +total);
	}
}	
 public class Empwage {
		
		public static void main(String[] args) 
		{
			
		Account a=new Account();
		a.calculate();
		a.dailywage();
			
			

		}

	}