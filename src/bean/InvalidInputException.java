package bean;

public class InvalidInputException extends Exception {

	private static final long serialVersionUID = -2326027339128351045L;
	private String errorDetails;
	
	public InvalidInputException(String reason, String errorDetails) {
		super(reason);
		this.errorDetails = errorDetails;
	}
	
	public String getFaultInfo() {
		return errorDetails;
	}

	
}
