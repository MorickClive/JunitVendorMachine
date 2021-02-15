package samplejunit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JunitFiveSample {
	
	private static final String div = "========================================";
	
	@BeforeAll
	public static void beforeTestSuite() {
		System.out.println("BeforeAll: Start of TestSuite\n");
	}
	
	@BeforeEach
	public void beforeTest() {
		System.out.println(div);
		System.out.println( "BeforeEach");
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
		System.out.println("AfterEach");
		System.out.println(div + "\n");
	}
	
	@AfterAll
	public static void afterTestSuite() {
		System.out.println("AfterAll: End of TestSuite");
	}
}
