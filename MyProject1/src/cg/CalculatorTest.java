package cg;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class CalculatorTest {

	@Test
	public void testadd() {
		Calculator ob=new Calculator();
		assertEquals(9,ob.add(4,5));
	}

}
