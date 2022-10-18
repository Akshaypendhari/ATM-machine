package atm;

public class ATM 
{
	private double balance;
	private double depositeAmmount;
	private double withdrawAmmount ;
	
	//default constructor
	public ATM()
	{
		
	}
	// getter setter 
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getDepositeAmmount() {
		return depositeAmmount;
	}

	public void setDepositeAmmount(double depositeAmmount) {
		this.depositeAmmount = depositeAmmount;
	}

	public double getWithdrawAmmount() {
		return withdrawAmmount;
	}

	public void setWithdrawAmmount(double withdrawAmmount) {
		this.withdrawAmmount = withdrawAmmount;
	}
	

	
	
}
