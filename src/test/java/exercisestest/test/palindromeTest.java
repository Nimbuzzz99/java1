package test.java.exercisestest.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import main.java.exercises.*;

public class palindromeTest {
	palindrome foo = null;
	@Before
	public void setUp() throws Exception {
	 foo = new palindrome();
	}

	@After
	public void tearDown() throws Exception {
		foo = null;
	}

	@Test
	public void testPalin() {
		boolean expec = true;
		boolean[] act = foo.palin(1331);
		assertEquals(expec , act[0]);
		assertEquals(expec , act[1]);
	}
	@Test
	public void testPalin1() {
		boolean expec = true;
		boolean[] act = foo.palin("aaaa");
		assertEquals(expec , act[0]);
	}
}
