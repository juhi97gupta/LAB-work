package cg;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	static Calculator ob;
	@BeforeAll
	public static void beforeallTests()

	{
		System.out.println("BEFORE ALL TESTS");
		ob=new Calculator();
	}
	@AfterAll
	public static void afterallTests()

	{
		System.out.println("AFTER ALL TESTS");
		ob=null;
	}
		@BeforeEach  //junit 4 @before
	
	
	public void beforeEachTest()
	{
		System.out.println("before each test");
		ob=new Calculator();
	}
	@AfterEach    //junit4 @After
public void afterEachTest()
{
	System.out.println("After each test");
	ob=null;
}
	@Disabled
	@Test
	public void idgenerator()
	{
		System.out.println("idgenerator");
		assertTrue(ob.idgenerator()>0);
		assertTrue(ob.idgenerator()<1000);
		
	}
	@RepeatedTest(5)
	@Test
	public void testadd() {
		System.out.println("test case testadd");
		Calculator ob=new Calculator();
		assertEquals(9,ob.add(4,5));
	}
	@Test
	public void testadd1() {
		System.out.println("test case testadd1");
		Calculator ob=new Calculator();
		assertTrue(ob.add(4,5)>0);
		assertTrue(ob.add(4,-5)>=0);
	}
}

