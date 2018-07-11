import static org.junit.Assert.*;

import org.junit.Test;

public class CalciTestTestTest {

	@Test
	public void testTestTest() {
		
			Calci c1=new Calci();
			assertEquals(7,c1.add(2,5));
		}
	

	@Test
	public void testTestTestSub() {
		Calci c1=new Calci();
		assertEquals(-3,c1.sub(2,5));
	}

	@Test
	public void testTestTestMul() {
		Calci c1=new Calci();
		assertEquals(10,c1.mul(2,5));
	}

}
