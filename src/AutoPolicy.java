//Class that represents an auto insurance policy
public class AutoPolicy {
	private int accountNumber; // policy account number
	private String makeAndModel; // car that the policy applies to
	private String state; // two-letter state abbreviation

	// constructor - used to instantiate the object or initialize new object
	public AutoPolicy(int accountNumber, String makeAndModel, String state) {
		this.accountNumber = accountNumber;
		this.makeAndModel = makeAndModel;
		this.state = state;
	}

}
