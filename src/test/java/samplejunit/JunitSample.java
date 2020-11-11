package samplejunit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JunitSample {
	
	@BeforeAll
	public static void beforeTestSuite() {
		System.out.println("BeforeClass: Start of TestSuite\n");
	}
	
	@BeforeEach
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

	@AfterEach
	public void afterTest() {
		System.out.println("After\n");
	}
	
	@AfterAll
	public static void afterTestSuite() {
		System.out.println("AfterClass: End of TestSuite");
	}
}
