package part02;

public class InsufficienctFundsException extends Exception {
	public InsufficienctFundsException(String getMessage) {
		super("You do not sufficient credit to send these messages, "
				+ "you need to " +getMessage);
	}
}
