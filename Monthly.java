package part02;

public class Monthly extends Contract {
	private int contract_ref;//reference number for the contract
	private int totalTexts;//number of remaining texts allowed
	
	public Monthly(int totalTexts) {
		//set the reference number to the next 
		//available contract ID and state the initial number of monthly texts.
		this.contract_ref=super.getContractRef();
		this.totalTexts=totalTexts;
	}
	public void sendTexts(int numTexts) throws InsufficienctFundsException{
		//The number of texts is deducted from the remaining texts allowed
		if(totalTexts >= numTexts) {
		this.totalTexts-=numTexts;
		System.out.println("Text messages sent");
		}
		else {
			throw new InsufficienctFundsException("you need to wait until next month"); 
		}
	}
	public int textsRemaining() {
		//This method returns the number of texts remaining 
		return this.totalTexts;
	}
	@Override
	public String getContractDetails() {
		//This method states the details of the account
		return "Monthly Contract, No. "+this.contract_ref+" has "+this.totalTexts+" texts left";
	}
}
