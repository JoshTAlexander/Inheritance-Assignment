/**
 * @author jta787
 * @version 16/11/19
 */
public class SubscriptionPrime extends Subscription implements SubscriptionPrimeInterface {
	private String Address;

	/**
	 * @param title
	 * @param email
	 * @param cost
	 * @param deliveryAdress
	 */
	public SubscriptionPrime(String title, String email, int cost, String deliveryAddress) {
	    super(title,email,cost);
	    this.Address = deliveryAddress;
	    }

	/**
	 * @return the deliveryAddress
	 */
	public String getAddress() {
		return Address;
	}

	/**
	 * @param deliveryAddress the deliveryAddress to set
	 */
	public void setAddress(String deliveryAddress) {
		this.Address = deliveryAddress;
	}
	
	
	/**
	 * override toString method returning the title, email, cost and delivery address
	 */
	@Override
	public String toString() {
		return "Subscription [title=" + getTitle() + ", email=" + getEmail() + ", cost=" + getCost() + "delivery Adress=" + Address + "]";
	}

	

	

}
