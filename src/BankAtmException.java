
public class BankAtmException extends Exception {
	String message;
	
	public BankAtmException()
	{
		super();
		this.message = "Balance is less than 10000 so withdraw is not allowed";
	}
	
	
	public BankAtmException(String message)
	{		
		super(message);
		this.message = message;
		
	}
	
	@Override
	public String getMessage() {
		return message;
	}

	@Override
	public void printStackTrace() {
		//System.out.println("Custom stack trace");
		//System.out.println("You can log it");
	}
}