/**
 * @author jta787
 * @version 16/11/19
 */
public class Aeroplane extends Aircraft {
	private double fuelConsumption;
	
	/**
	 * @param passengerNumber
	 * @param maxSpeed
	 * @param fuelConsumption
	 */
	public Aeroplane(int passengerNumber, int maxSpeed, double fuelConsumption) {
		super(passengerNumber, maxSpeed);
		this.fuelConsumption = fuelConsumption;
	}
	
	 /**
	 * @param fuelConsumption the fuelConsumption to set
	 */
	public void setFuelConsumption(double fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}
	
	/**
	 * @return the fuelConsumption
	 */
	public double getFuelConsumption() {
		return fuelConsumption;
	}

	/**
	 * toString returns fuel consumption, passenger number and maxspeed
	 */
	@Override
	public String toString() {
		return "Aeroplane [fuelConsumption=" + fuelConsumption + ", getPassengerNumber()=" + getPassengerNumber()
				+ ", getMaxSpeed()=" + getMaxSpeed() + "]";
	}
	
	
}
