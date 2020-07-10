package vendormachine.users;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import java.lang.StringBuilder;

import vendormachine.users.Person;
import vendormachine.users.util.Wallet;

// Uncomment for Example 100% Person Test Coverage
@Ignore
public class PersonTEST {
	
	// Resources
	private float credit = 10.0f;
	private static Wallet testWallet = new Wallet();
	
	// Keep track of tests
	private static int activeTest = 1;
	private static StringBuilder sBuilder = new StringBuilder();
	private static String div = "=============================================\n";
	
	@Before
	public void beforeTest() {
		
		// Set Default test Wallet credit
		testWallet.setCredit(credit);
		
		// Start of console test format
		sBuilder.setLength(0);
		sBuilder
		.append("\tTest ").append(activeTest).append("\n")
		.append(div)
		.append("Console:")
		.append("Starting Credit: ").append(testWallet.getAllCredit()).append("\n");
		
		System.out.println(sBuilder.toString());
		activeTest++;
		// End of console test format
	}
	
	@Test
	public void test_Constructor() {
		Person alan = new Person("Allan");
		
		alan.setName("Alan");
		alan.setWallet(testWallet);
		
		assertEquals("Alan", alan.getName());
		assertTrue(alan.getWallet() instanceof Wallet);
		
		alan.addCredit(5.0f);
		assertEquals(15.0f, alan.getCredit(15.0f), 0.1f);
	}
	
	@Test
	public void test1() {
		Person alyx = new Person("Alyx", testWallet);
		float result = alyx.getCredit(5.0f);
		
		assertEquals(5.0f, result, 0.1f);
	}
	
	@Test
	public void test2() {		
		Person alyx = new Person("Alyx", testWallet);
		float result = alyx.getCredit(10.0f);
		
		assertEquals(10.0f, result, 0.1f);
	}
	
	@Test
	public void test_noWallet() {		
		Person alyx = new Person("Alyx");
		
		alyx.addCredit(10.0f);
		
		assertTrue(alyx.getWallet() == null);
		assertEquals(0, alyx.getCredit(5.0f), 0.1f);
	}
	
	@Test
	public void test_insufficentWalletfunds() {		
		Person alyx = new Person("Alyx", testWallet);
		
		assertEquals(0f, alyx.getCredit(20.0f), 0.1f);
	}
	
	@After
	public void afterTest() {
		System.out.println(div);
	}

}
