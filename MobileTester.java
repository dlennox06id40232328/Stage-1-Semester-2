package part02;

import java.util.ArrayList;

public class MobileTester {

	public static void main(String[] args) {
		Contract monthly = new Monthly(250);
		Contract payAsYouGo = new PayAsYouGo(10);
		
		ArrayList<Contract> myContracts = new ArrayList<Contract>();
		myContracts.add(monthly);
		myContracts.add(payAsYouGo);
		
		try {
			
			((Monthly)myContracts.get(0)).sendTexts(101);
			((PayAsYouGo)myContracts.get(1)).sendTexts(101);
			
		} catch (InsufficienctFundsException e) {
			System.out.println(e.getMessage());
		}
	}

} // End of class
