package atm;
import java.util.*;

public class Working implements Operation {
	ATM atm=new ATM();
	Map<Double,String> ministat =new HashMap<>();
	
	@Override
	public double balance() {
		System.out.println("Available balance is : "+ atm.getBalance());
		
		return 0;
	}

	@Override
	public double depositeAmmount(double depositeAmmount) {
		ministat.put(depositeAmmount, "  amount deposited");
		
		System.out.println(depositeAmmount + "Deposited succesfully...");
		atm.setBalance(atm.getBalance()+depositeAmmount);
		balance();
		return 0;
	}

	@Override
	public double withdrawAmmount (double withdrawAmmount) {
		
		if (withdrawAmmount<atm.getBalance()) {
	ministat.put(withdrawAmmount, "  amount withdraw");
	
		System.out.println("collect the cash " + withdrawAmmount);
		atm.setBalance( atm.getBalance( )- withdrawAmmount);
		balance();
	}
		else {
			System.out.println(" Enter valid  Ammount ");
		}
		return 0;
	}

	@Override
	public void viewMiniStatement() {
		for(Map.Entry<Double,String> m: ministat.entrySet()) {
			System.out.println(m.getKey()+ ""+ m.getValue());
		}
		// TODO Auto-generated method stub
		
	}

}
