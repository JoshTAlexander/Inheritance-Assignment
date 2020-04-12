import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AccountTest {

	 private MusicTitle musicTitle;
	 private AccountStandard Tim;
	 private AccountAdministrator Admin;
	 
	 @BeforeEach
	  public void init() {
	    musicTitle = new MusicTitle("Hello", "Adele", 15);
	 
	 
	 ArrayList<MusicTitleInterface> testList = new ArrayList<>();
	    testList.add(musicTitle);
	    
	    Tim = new AccountStandard("Tim", "Mr", "tim@gmail.com", "qwerty");
	    Admin = new AccountAdministrator("James", "Mr", "james@admin.com", "1224");
	 }
	    
	 @Test
	  public void test1() {
	    String expectedTitle = "Hello";
	    String actualTitle = musicTitle.getTitle();
	    assertEquals(expectedTitle, actualTitle, "actual: " + actualTitle);
	  }
	  
	 @Test
	  public void test2() {
	    String expectedArtist = "Adele";
	    String actualArtist = musicTitle.getArtist();
	    assertEquals(expectedArtist, actualArtist, "actual: " + actualArtist);
	  }
	 
	 @Test
	  public void test3() {
	    int expectedPrice = 15;
	    int actualPrice = musicTitle.getPrice();
	    assertEquals(expectedPrice, actualPrice, "actual: " + actualPrice);
	  }
	 
	 @Test
	 public void test4() {
		    String expectedName = "Tim";
		    String actualName = Tim.getName();
		    assertEquals(expectedName, actualName, "actual: " + actualName);
		  }
	 
	 @Test
	  public void test5() {
	    String expectedSalutation = "Mr";
	    String actualSalutation = Tim.getSalutation();
	    assertEquals(expectedSalutation, actualSalutation, "actual: " + actualSalutation);
	  }
	 
	 @Test
	  public void test6() {
	    String expectedEmail = "tim@gmail.com";
	    String actualEmail = Tim.getEmail();
	    assertEquals(expectedEmail, actualEmail, "actual: " + actualEmail);
	  }
	 
	 @Test
	  public void test7() {
	    int expectedBalance = 0;
	    int actualBalance = Tim.getBalance();
	    assertEquals(expectedBalance, actualBalance, "actual: " + actualBalance);
	  }
	 
	 @Test
	  public void test8() {
	    ArrayList<MusicTitle> expectedPurchaseList = new ArrayList<>();
	    ArrayList<MusicTitle> actualPurchaseList = Tim.getTitlesBought();
	    for (int i = 0; i < actualPurchaseList.size(); i++) {
	      assertEquals(expectedPurchaseList.get(i), actualPurchaseList.get(i), "actual: " + actualPurchaseList.get(i))  ;
	    }
	  }
	 
	 @Test
	  public void test9() {
	    int expectedFailedLoginAttempts = 0;
	    int actualFailedLoginAttempts = 0;
	    assertEquals(expectedFailedLoginAttempts, actualFailedLoginAttempts,
	        "actual: " + actualFailedLoginAttempts);
	  }
	 
	 @Test
	  public void test10() {
	    int expectedMaximalLoginAttempts = 3;
	    int actualMaximalLoginAttempts = AccountStandard.MAXIMAL_LOGIN_ATTEMPTS;
	    assertEquals(expectedMaximalLoginAttempts, actualMaximalLoginAttempts,
	        "actual: " + actualMaximalLoginAttempts);
	  }
	 
	 @Test
	  public void test11() {
	    Tim.login("wrong");
	    assertFalse(Tim.getLoggedIn());

	    assertEquals(1, Tim.getFailedLoginAttempts());

	    Tim.login("wrong");
	    assertFalse(Tim.getLoggedIn());

	    assertEquals(2, Tim.getFailedLoginAttempts());

	    Tim.login("qwerty");
	    assertTrue(Tim.getLoggedIn());

	    assertEquals(0, Tim.getFailedLoginAttempts());

	    Tim.deposit(100);
	    Tim.buy(musicTitle);

	    String expectedMusicTitle = "Hello";
	    String actualMusicTitle = Tim.getTitlesBought().get(0).getTitle();
	    assertEquals(expectedMusicTitle, actualMusicTitle);

	    String expectedArtist = "Adele";
	    String actualArtist = Tim.getTitlesBought().get(0).getArtist();
	    assertEquals(expectedArtist, actualArtist);

	    int expectedPrice = 15;
	    int actualPrice = Tim.getTitlesBought().get(0).getPrice();
	    assertEquals(expectedPrice, actualPrice);

	    int expectedBalance = 85;
	    int actualBalance = Tim.getBalance();
	    assertEquals(expectedBalance, actualBalance);

	    Tim.logout();
	    assertFalse(Tim.getLoggedIn());

	    Tim.deposit(10);
	    expectedBalance = 95;
	    actualBalance = Tim.getBalance();
	    assertEquals(expectedBalance, actualBalance);
	  }
	 
	  @Test
	  public void test12() {
	    Tim.login("cOrn");
	    assertFalse(Tim.getLoggedIn());

	    assertEquals(1, Tim.getFailedLoginAttempts());

	    Tim.login("cOrrn");
	    assertFalse(Tim.getLoggedIn());

	    assertEquals(2, Tim.getFailedLoginAttempts());

	    Tim.login("c0rn");
	    assertFalse(Tim.getLoggedIn());

	    assertEquals(3, Tim.getFailedLoginAttempts());

	    Admin.login("1225");
	    assertFalse(Admin.getLoggedIn());

	    Admin.login("1224");
	    assertTrue(Admin.getLoggedIn());

	    Admin.addAccount(Tim);
	    String expectedAccountName = "Tim";
	    String actualAccountName = Admin.getAccounts().get(0).getName();
	    assertEquals(expectedAccountName, actualAccountName);
	    assertTrue(!Admin.getAccounts().isEmpty());

	    Admin.resetAccount(Tim, "new");
	    System.out.println(Admin);
	    String expectedPassword = "new";
	    assertTrue(Tim.checkPassword(expectedPassword));

	    int expectedFailedLoginAttempts = 0;
	    int actualFailLoginAttempts = Tim.getFailedLoginAttempts();
	    assertEquals(expectedFailedLoginAttempts, actualFailLoginAttempts);

	    Tim.login("new");
	  }

}
