import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AircraftTest {
	
	public static final double TOLERANCE = 0.00001;
	  private Aircraft aircraft1;
	  private Aeroplane boeing747;
	  
	  @BeforeEach
	  public void init() {

	    aircraft1 = new Aircraft(400, 650);
	    boeing747 = new Aeroplane(600, 700, 550);
	    
	  }
	  
	  @Test
	  public void test1() {

	    int expectedNumOfPassengers = 400;
	    int actualNumOfPassengers = aircraft1.getPassengerNumber();
	    assertEquals(expectedNumOfPassengers, actualNumOfPassengers);

	    int expectedMaxSpeed = 650;
	    int actualMaxSpeed = aircraft1.getMaxSpeed();
	    assertEquals(expectedMaxSpeed, actualMaxSpeed);
	  }
	  
	  @Test
	  public void test2() {

	    aircraft1.setPassengerNumber(485);
	    int expectedNumOfPassengers = 485;
	    int actualNumOfPassengers = aircraft1.getPassengerNumber();
	    assertEquals(expectedNumOfPassengers, actualNumOfPassengers);

	    aircraft1.setMaxSpeed(525);
	    int expectedMaxSpeed = 525;
	    int actualMaxSpeed = aircraft1.getMaxSpeed();
	    assertEquals(expectedMaxSpeed, actualMaxSpeed);
	  }
	  
	  @Test
	  public void test3() {

	    int expectedNumOfPassengers = 600;
	    int actualNumOfPassengers = boeing747.getPassengerNumber();
	    assertEquals(expectedNumOfPassengers, actualNumOfPassengers);

	    int expectedMaxSpeed = 700;
	    int actualMaxSpeed = boeing747.getMaxSpeed();
	    assertEquals(expectedMaxSpeed, actualMaxSpeed);

	    double expectedFuelCons = 550;
	    double actualFuelCons = boeing747.getFuelConsumption();
	    assertEquals(expectedFuelCons, actualFuelCons, TOLERANCE);
	  }
	  
	  @Test
	  public void test4() {

		boeing747.setPassengerNumber(641);
	    int expectedNumOfPassengers = 641;
	    int actualNumOfPassengers = boeing747.getPassengerNumber();
	    assertEquals(expectedNumOfPassengers, actualNumOfPassengers);

	    boeing747.setMaxSpeed(977);
	    int expectedMaxSpeed = 977;
	    int actualMaxSpeed = boeing747.getMaxSpeed();
	    assertEquals(expectedMaxSpeed, actualMaxSpeed);


	    boeing747.setFuelConsumption(17.123);
	    double expectedFuelCons = 17.123;
	    double actualFuelCons = boeing747.getFuelConsumption();
	    assertEquals(expectedFuelCons, actualFuelCons, TOLERANCE);
	  }
	
	
}


