
/**
 * @author jta787
 * @version 16/11/19
 */
public abstract class Account implements AccountInterface {
	private String name;
	private String salutation;
	private String email;
	private String password;
	boolean loggedIn;
	
	

	
	/**
	 * @param name
	 * @param salutation
	 * @param email
	 * @param password
	 * @param loggedIn
	 */
	public Account(String name, String salutation, String email, String password) {
		this.name = name;
		this.salutation = salutation;
		this.email = email;
		this.password = password;
	    this.loggedIn = false;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

    /**
	 * @return the salutation
	 */
	public String getSalutation() {
		return salutation;
	}

     /**
     * @return the email
	 */
	public String getEmail() {
		return email;
	}
     /**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
     /**
	 * @return the loggedIn
	 */
	public boolean getLoggedIn() {
		return loggedIn;
	}
     /**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
     /**
	 * @param salutation the salutation to set
	 */
	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}
    /**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
     /**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
     /**
	 * @param loggedIn the loggedIn to set
	 */
	public void setLoggedIn(boolean loggedIn) {
		this.loggedIn = loggedIn;
	}
	/**
	 * @param login, check the password is correct, else 
	 */
	public void login(String password){
        if (checkPassword(password)){
        	loggedIn = true;
        	}
    }
	/**
	 * @param logout, sets loggedin to false
	 */
	 public void logout(){
	        setLoggedIn(false);
	    }
	 /**
		 * @param checkPassword, checks if the password equals this password
		 */
	 public boolean checkPassword(String password){
	        return password.equals(this.password);
	    }
	 /**
		 * @param changePassword, can set a new password if the current password is correct
		 */
	 public void changePassword(String oldPassword, String newPassword){
	        if (checkPassword(oldPassword)){ setPassword(newPassword); }
	    }
	 /**
		 * @param toString, returns the account name, salutation, email, password and if logged in
		 */
	public String toString() {
		return "Account [name=" + name + ", salutation=" + salutation + ", email=" + email + ", password=" + password
				+ ", loggedIn=" + loggedIn + "]";
	}

	public static void main(String[] args) {
		

	}

	
}
