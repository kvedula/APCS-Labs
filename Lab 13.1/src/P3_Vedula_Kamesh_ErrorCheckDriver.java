
public class P3_Vedula_Kamesh_ErrorCheckDriver {

	public static void main(String[] args){
		
		CheckingAccount a = null;
		
		
		try {
			a = new CheckingAccount(-5000, 5677);
			
		} catch(IllegalArgumentException e){
			System.out.println(e);

		}


		try {
			a = new CheckingAccount(6000, 5677);
			a.withdraw(7000);
			
		} catch(IllegalArgumentException e){
			System.out.println(e);

		}
		
		try {
			a.deposit(-6000);
			
		} catch(IllegalArgumentException e){
			System.out.println(e);

		}
		
	}
}




class CheckingAccount{
	private double myBalance;
	private int myAccountNumber;

	public CheckingAccount(){
		myBalance = 0.0;
		setMyAccountNumber(0);
	}

	/*
	 * Precondition: User must enter an account number and a positive initial balance to be able to run program
	 * Postcondition: Program creates a Checking Account with the data that is inputed 
	 */
	public CheckingAccount(double initialBalance, int acctNum){

		if(initialBalance < 0){
			throw new IllegalArgumentException("You cannot have a negative initial balance.");
		} else {
			myBalance = initialBalance;
			setMyAccountNumber(acctNum);
		}
		
	}

	public double getBalance(){
		return myBalance;
	}


	/*
	 * Precondition: Must be depositing a positive amount
	 * Postcondition: Money is added to the balnce
	 */
	public void deposit(double amount){

		if(amount < 0){
			throw new IllegalArgumentException("You cannot deposit a negative amount of money to your bank account!!");
		}

		myBalance += amount;
	}

	/*
	 * Precondition: There must be more money than what is deposited. 
	 * Postcondition: Program will subtract the amount withdrawn from the account balance
	 */
	public void withdraw( double amount ){

		if(myBalance - amount < 0){
			throw new IllegalArgumentException("You cannot withdraw any more money than you currently have deposited!!");
		}

		myBalance -= amount;

	}

	public int getMyAccountNumber() {
		return myAccountNumber;
	}

	public void setMyAccountNumber(int myAccountNumber) {
		this.myAccountNumber = myAccountNumber;
	}
}





