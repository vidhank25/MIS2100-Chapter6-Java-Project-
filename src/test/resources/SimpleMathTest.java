import static org.junit.Assert.*;

import org.junit.Test;

import Khanal.Vidhan.Chapter6.Java.Project.SimpleMath;

public class SimpleMathTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testThatZeroNumeratorReturnsZero() {
		SimpleMath math = new SimpleMath();
		assertEquals(0,math.divide(0, 7));
	}
	
	@Test
	public void testThatSmallerNumeratorReturnsDecimalValue() {
		SimpleMath math = new SimpleMath();
		assertEquals(.25, math.divide(1, 4));
	}
	
	@Test(expected = Exception.class)
	public void testThatZeroDenominatorThrowsException() {
		SimpleMath math = new SimpleMath();
		math.divide(4, 0);
		
		
	}
}
