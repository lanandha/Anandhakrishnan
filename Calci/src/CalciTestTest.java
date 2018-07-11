import static org.junit.Assert.*;

import org.junit.Test;

public class CalciTestTest {

	@Test
	public void testTest() {
		Calci c1=new Calci();
		assertEquals(7,c1.add(2,5));
	}
	public void testTestSub() {
		Calci c1=new Calci();
		assertEquals(-3,c1.sub(2,5));
	}public void testTestMul() {
		Calci c1=new Calci();
		assertEquals(10,c1.mul(2,5));
	}
}
