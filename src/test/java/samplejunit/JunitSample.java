package samplejunit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitSample {
	
	@BeforeClass
	public static void beforeTestSuite() {
		System.out.println("BeforeClass: Start of TestSuite\n");
	}
	
	@Before
	public void beforeTest() {
		System.out.println("Before");
	}
	
	@Test
	public void test1() {
		System.out.println("- Test1");
	}
	
	@Test
	public void test2() {
		System.out.println("- Test2");
	}

	@After
	public void afterTest() {
		System.out.println("After\n");
	}
	
	@AfterClass
	public static void afterTestSuite() {
		System.out.println("AfterClass: End of TestSuite");
	}
}
