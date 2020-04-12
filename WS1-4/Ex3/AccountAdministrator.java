import java.util.ArrayList;

/**
 * @author josh
 * @version 16/11/19
 */
public class AccountAdministrator extends Account implements AccountAdministratorInterface {
	private ArrayList<Account> accounts;
	
	/**
	 * @param name
	 * @param salutation
	 * @param email
	 * @param password
	 * @param accounts
	 */
	public AccountAdministrator(String name, String salutation, String email, String password) {
		super(name, salutation, email, password);
		this.accounts = new ArrayList<>();
	}
	/**
	 * @param ArrayList, returns accounts
	 */
	public ArrayList<Account> getAccounts() {
        return accounts;
	}
	/**
	 * @param AddAccount, adds account to accounts
	 */
	 public void addAccount(Account account){
	        accounts.add(account);
	    }

	 /**
		 * @param resetAccount, if logged in can set the password and set failed log in attempts to 0
		 */
	 public void resetAccount(Account account, String password){
	        if (getLoggedIn()) {
	            account.setPassword(password);
	            if (account instanceof AccountStandard) { 
	                ((AccountStandard) account).setFailedLoginAttempts(0);
	            }
	        }
	    }
	 /**
		 * toString method to return the super and accounts if logged in, if not print log in
		 */
 @Override
	    public String toString() {
	        if (getLoggedIn()) {
	            return "AccountAdministrator[ " + super.toString() +
	                    " accounts: " + accounts +
	                    '}';
	        }
	        else { return "log in."; }
	     }


	public static void main(String[] args) {


	}
}
