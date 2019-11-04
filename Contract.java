package part02;

public abstract class Contract {
	private static int contractRef=0;

	//This method will return the next 
	//available reference number for a contract.
	public static int getContractRef() {
		return Contract.contractRef++;
	}

	public abstract String getContractDetails();
}
