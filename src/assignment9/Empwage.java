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
}	
 public class Empwage {
		
		public static void main(String[] args) 
		{
			
		Account a=new Account();
		a.calculate();
			
			

		}

	}