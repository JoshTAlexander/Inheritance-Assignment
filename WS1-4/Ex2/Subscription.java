/**
 * @author jta787
 * @version 16/11/19
 */
public class Subscription implements SubscriptionInterface {
	private String title;
	private String email;
	private int cost;
	
	/**
	 * @param title
	 * @param email
	 * @param cost
	 */
	public Subscription(String title, String email, int cost) {
		this.title = title;
		this.email = email;
		this.cost = cost;
	}
	
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}


     /**
	 * @return the cost
	 */
	public int getCost() {
		return cost;
	}

     /**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

     /**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

     /**
	 * @param cost the cost to set
	 */
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	/**
	 * toString method to return the title, email and cost
	 */
	public String toString() {
		return "Subscription [title=" + title + ", email=" + email + ", cost=" + cost + "]";
	}

	public static void main(String[] args) {
		

	}

}
