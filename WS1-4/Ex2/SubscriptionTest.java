import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SubscriptionTest {
	private SubscriptionInterface subscription1;
	  private SubscriptionPrime subscriptionPrime;

	  @BeforeEach
	  public void init() {
	    subscription1 = new Subscription("Daily Mail", "james@aol.com", 5);
	    subscriptionPrime = new SubscriptionPrime("The sun", "ted@gmail.com", 7, "22 selly oak");
	  }
	  
	  @Test
	  public void test1() {
	    String expectedTitle = "Daily Mail";
	    String actualTitle = subscription1.getTitle();
	    assertEquals(expectedTitle, actualTitle, "actual: " + actualTitle);
	  }
	  
	  @Test
	  public void test2() {
	    String expectedEmail = "james@aol.com";
	    String actualEmail = subscription1.getEmail();
	    assertEquals(expectedEmail, actualEmail, "actual:  " + actualEmail);
	  }
	  
	  @Test
	  public void test3() {
	    int expectedCost = 5;
	    int actualCost = subscription1.getCost();
	    assertEquals(expectedCost, actualCost, "actual: " + actualCost);
	  }
	  
	  @Test
	  public void test4() {
	    String expectedTitle = "The sun";
	    String actualTitle = subscriptionPrime.getTitle();
	    assertEquals(expectedTitle, actualTitle, "actual: " + actualTitle);
	  }
	  
	  @Test
	  public void test5() {
	    String expectedEmail = "ted@gmail.com";
	    String actualEmail = subscriptionPrime.getEmail();
	    assertEquals(expectedEmail, actualEmail, "actual: " + actualEmail);
	    }
	  
	  @Test
	  public void test6() {
	    int expectedCost = 7;
	    int actualCost = subscriptionPrime.getCost();
	    assertEquals(expectedCost, actualCost, "actual: " + actualCost);
	  }
	  
	  public void test7() {
		    String expectedDeliveryAddress = "22 selly oak";
		    String actualDeliveryAddress = subscriptionPrime.getAddress();
		    assertEquals(expectedDeliveryAddress, actualDeliveryAddress,
		        "actual: " + actualDeliveryAddress);
		    }
}
