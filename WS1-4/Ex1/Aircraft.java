/**
 * 
 */

/**
 * @author jta787
 * @version 16/11/19
 */
public class Aircraft {
	private int passengerNumber;
	private int maxSpeed;
	




	/**
	 * @param passengerNumber
	 * @param maxSpeed
	 */
	public Aircraft(int passengerNumber, int maxSpeed) {
		this.passengerNumber = passengerNumber;
		this.maxSpeed = maxSpeed;
	}
	
	
	/**
	 * @return the passengerNumber
	 */
	public int getPassengerNumber() {
		return passengerNumber;
	}


	/**
	 * @return the maxSpeed
	 */
	public int getMaxSpeed() {
		return maxSpeed;
	}


	/**
	 * @param passengerNumber the passengerNumber to set
	 */
	public void setPassengerNumber(int passengerNumber) {
		this.passengerNumber = passengerNumber;
	}


	/**
	 * @param maxSpeed the maxSpeed to set
	 */
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	/**
	 * toString returns passenger number and maxspeed
	 */
	public String toString() {
		return "Aircraft [passengerNumber=" + passengerNumber + ", maxSpeed=" + maxSpeed + "]";
	}


	public static void main(String[] args) {
		

	}

}
