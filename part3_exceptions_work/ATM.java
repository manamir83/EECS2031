package part3_exceptions_work;

import part3_exceptions.SavingsAccount;

public class ATM {
	
	
	/** withdraw amount from the account b
	 * takes as arguments an SavingsAccount, and an array of amounts to withdraw from the account. 
	 * The method tries to withdraw the amounts in the array one by one. 
	 * It returns an array of strings indicating the result of each withdrawal. 
	 * For each successful withdrawal it puts �success� to the array. 
	 * If the amount cannot be withdrawn successfully, 
	 * it puts �failure (xxx)� in the array, where xxx is the reason for failure
	 * for example: failure (negative amount)   
	 * failure (need 100 balance)
	 * 
	 * @param b SaveingAccount to operate on
	 * @param amount array of amounts to withdraw
	 * @return an array of results of each withdrawal
	 */
	 public static String[] withdrawMe (SavingsAccount b, double amount[]) {
		String[] resu = new String[amount.length];
		 
		for(int i=0; i< amount.length;i++) {
			try {
				b.withdrawATM(amount[i]); // try the withdraw
				resu[i]="success";
			}catch(IllegalArgumentException e) {
				resu[i]= "failure (" + e.getMessage() + ")";
			}
		}
		return resu;
		
	}
	 
	 
	/** deposit amount from the account b
	 * takes as arguments an SavingsAccount, and an array of amounts to deposit from the account. 
	 * The method tries to deposit the amounts in the array one by one. 
	 * It returns an array of strings indicating the result of each deposit. 
	 * For each successful deposit it puts �success� to the array. 
	 * If the amount cannot be withdrawn successfully, 
	 * it puts �failure (xxx)� in the array, where xxx is the reason for failure
	 * for example: failure (negative amount)   
	 * failure (beyond half balance)
	 * 
	 * @param b SaveingAccount to operate on
	 * @param amount array of amounts to deposit
	 * @return an array of results of each deposit
	 */
	public static String[] depositMe (SavingsAccount b, double amount[]) {
		String[] resu = new String[amount.length];
		
		for(int i=0; i<amount.length;i++) {
			try {
				    b.depositATM(amount[i]);
				    resu[i]="success";
			}catch(IllegalArgumentException e) {
				resu[i] ="failure (" + e.getMessage() + ")";
			}
		}
		 
		return resu;
		
	}

	
}
