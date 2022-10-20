package atm;

import java.util.Scanner;

public class MainClass {


public static void main(String[] args) {
	//upcasting
	Operation ref1 = new Working();
	
	

	Scanner sc=new Scanner(System.in);

	System.out.println("Enter your name");
	String name =sc.nextLine();
	System.out.println("Enter your ATM card NO");
	long cardNumber=sc.nextLong();
	System.out.println("Enter your PIN");
	int pin=sc.nextInt();

	System.out.println("Account Created succesfully\n\n ");
System.out.println("LOGIN WITH YOUR PROPER DETAILS\n\n");
	System.out.println("Welcome to ATM machine");
	System.out.println("Enter ATM Number ");
	long number = sc.nextInt();
	System.out.println("Enter ATM PIN ");
	int pinno = sc.nextInt();
	
	if((cardNumber==number)&&(pin==pinno))
	{ while(true) {
		System.out.println("Welcome akshay ");
		System.out.println("1. View Balance");
		System.out.println("2. Withdraw ammount ");
		System.out.println("3. Deposite  ammount");
		System.out.println("4. View mini statement ");
		System.out.println("0. Exit");
		System.out.println("Enter choice");
		int ch=sc.nextInt();
		if (ch==1)
		{
			ref1.balance();
		}
		else if(ch==2)
		{
			System.out.println("enter Withdraw ammount ");
			double withdrawammount = sc.nextDouble();
			ref1.withdrawAmmount(withdrawammount);
			
		}
		else if(ch==3)
		{
			System.out.println("Enter ammount to diposite");
			double deposite=sc.nextDouble();
			ref1.depositeAmmount(deposite);
		}
		else if(ch==4)
		{
			ref1.viewMiniStatement();
		}
		else if(ch==0)
		{
			System.out.println("Collect your atm card");
			System.out.println("thank for using ATM machine");
			
		}
		else 
		{
			System.err.println("choose proper option");
		}
	}
	}
	
	else 
	{
		System.out.println("Incorrect ATM Number Or pin");
	
	}	
}


}
