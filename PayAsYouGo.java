package part02;

public class PayAsYouGo extends Contract{
	private int contract_ref;//reference number for the contract
	private double credit;//total credit of the account
	private static final double TEXTCOST = 0.1;//the price of a single text
	
	public PayAsYouGo(double credit) {
		//set the reference number to the next 
		//available contract ID and state the initial credit.
		this.contract_ref=super.getContractRef();
		this.credit=credit;
	}
	public void addCredit(double funds) {
		//add funds to the account's credit
		this.credit+=funds;
	}
	public void sendTexts(int numTexts) throws InsufficienctFundsException{
		//Calculates the cost of sending "numTexts" 
		//and deducts this cost from the credit.
		// credit >= textcost
		if(credit >= TEXTCOST) {
		this.credit-=numTexts*TEXTCOST;
		System.out.println("Text messages sent");
		}
		else {
			throw new InsufficienctFundsException("you need to top up"); 
		}
	}
	public double getCredit() {
		//This method returns the current balance 
		return this.credit;
	}
	@Override
	public String getContractDetails() {
		//This method states the details of the account
		return "Pay As You Go Contract, No. "+this.contract_ref+" has "+this.credit+" credit";
	}
}
