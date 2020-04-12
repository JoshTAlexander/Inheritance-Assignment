import java.util.ArrayList;

/**
 * @author jta787
 * @version 16/11/19
 */
public class AccountStandard extends Account implements AccountStandardInterface {
private int balance;
private ArrayList<MusicTitle> titlesBought;
private int failedLoginAttempts;

public static final int MAXIMAL_LOGIN_ATTEMPTS = 3 ;

/**
 * @param name
 * @param salutation
 * @param email
 * @param password
 * @param loggedIn
 * @param balance
 * @param titlesBought
 * @param failedLoginAttempts
 */

public AccountStandard(String name, String salutation, String email, String password) {
	super(name, salutation, email, password);
	this.balance = 0;
	this.titlesBought = new ArrayList<>();
	this.failedLoginAttempts = 0;
}

/**
 * @return the balance
 */
public int getBalance() {
	return balance;
}
/**
 * @return the titlesBought
 */
public ArrayList<MusicTitle> getTitlesBought() {
	return titlesBought;
}

/**
 * @return the failedLoginAttempts
 */
public int getFailedLoginAttempts() {
	return failedLoginAttempts;
}

/**
 * @return the maximalLoginAttempts
 */
public static int getMaximalLoginAttempts() {
	return MAXIMAL_LOGIN_ATTEMPTS;
}

/**
 * @param balance the balance to set
 */
public void setBalance(int balance) {
	this.balance = balance;
}

/**
 * @param titlesBought the titlesBought to set
 */
public void setTitlesBought(ArrayList<MusicTitle> titlesBought) {
	this.titlesBought = titlesBought;
}
/**
 * @param failedLoginAttempts the failedLoginAttempts to set
 */
public void setFailedLoginAttempts(int failedLoginAttempts) {
	this.failedLoginAttempts = failedLoginAttempts;
}
/**
 * @param login, if the user has used all login attempts, lock account, if they log in reset login attempts to 0, if they fail add 1 to failed attempts.
 */
@Override
public void login(String password){
    if (failedLoginAttempts >= MAXIMAL_LOGIN_ATTEMPTS){ System.out.println("Account locked"); }
    else { super.login(password); }

    if (getLoggedIn()){ setFailedLoginAttempts(0); }
    else { setFailedLoginAttempts(getFailedLoginAttempts() + 1); }
}

/**
 * @param deposit, adds deposit to the balance
 */
public void deposit(int amount){
    balance += amount;
    }


/**
 * @param buy, if the user is logged in and their balance is grater than the cost of the music, add the music to titlesBought and decrease their balance by the cost.
 * if not logged in print log in, if not enough funds, print not enough funds
 */

public void buy(MusicTitle musicTitle){
    if (getLoggedIn() && balance >= musicTitle.getPrice()){ 
        titlesBought.add(musicTitle);
        balance -= musicTitle.getPrice(); 
    }
    if (!(getLoggedIn())) { System.out.println("Need to log in to buy music"); }
    if (balance < musicTitle.getPrice()) { System.out.println("Not enough money in the balance"); }
}

/**
 * toString method to return the super and balance, titles bought and failed log in attempts. 
 */
@Override
public String toString() {
	return "AccountStandard" + super.toString() + " [balance=" + balance + ", titlesBought=" + titlesBought + ", failedLoginAttempts="
			+ failedLoginAttempts + "]";
}

public static void main(String[] args) {
	
	}
}











	


