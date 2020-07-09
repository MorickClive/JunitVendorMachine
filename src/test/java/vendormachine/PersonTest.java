package vendormachine;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import vendormachine.users.Person;
import vendormachine.users.util.Wallet;

public class PersonTest {
	
	float credit = 10.0f;
	Wallet testWallet = new Wallet(credit);
	
	@Before
	public void beforeTest() {
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
		float result = alyx.getCredit(15.0f);
		
		// here we expect it to fail if we didn't set credit in @before.
		assertEquals(15.0f, result, 0.1f);
	}
	
	@After
	public void afterTest() {
		System.out.println("After my test");
	}

}
