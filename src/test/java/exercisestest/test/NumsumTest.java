package test.java.exercisestest.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import main.java.exercises.*;

public class NumsumTest {
    Numsum foo = null;
	@Before
	public void setUp() throws Exception {
		foo = new Numsum();
	}

	@After
	public void tearDown() throws Exception {
		foo = null;
	}

	@Test
	public void testNumsumact() {
		int expected = 10;
		int actual = foo.numsumact();
		assertEquals(expected , actual);
	}

}
