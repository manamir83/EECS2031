package part3_exceptions;

/**
 * class that implement BankAccount interface
 * 
 *
 */
public class SavingsAccount implements BankAccount {

	private double balance;
	
	/**
	 * custom constructor
	 * 
	 * @param balance  balance to set
	 */
	public SavingsAccount(double balance) {
		super();
		this.balance = balance;
	}

	/**
	 * withdraw amount
	 */
	@Override
	public void withdrawATM(double amount) {
		// TODO Auto-generated method stub
		if(amount <0 )
			throw new IllegalArgumentException("negative amount");
		else if (amount > balance-100) 
			throw new IllegalArgumentException("need 100 balance");
		balance -=amount;
	}
	
	/**
	 *  deposit amount 
	 */
	@Override
	public void depositATM(double amount) {
		// TODO Auto-generated method stub
		if(amount <0 )
			throw new IllegalArgumentException("negative amount");
		if( amount > balance/2)
			throw new IllegalArgumentException("beyond half balance");
		balance +=amount;
	}
	
	protected double getBalance() { // ATM cannot access, but Junit can
		return balance;
	}
	

}
