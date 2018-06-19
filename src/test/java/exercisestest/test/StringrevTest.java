package test.java.exercisestest.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import main.java.exercises.*;

public class StringrevTest {
    Stringrev foo = null;
	@Before
	public void setUp() throws Exception {
		foo = new Stringrev();
	}

	@After
	public void tearDown() throws Exception {
		foo = null;
	}

	@Test
	public void testRevstr() {
		String expected = "nodnol";
		String actual = foo.revstr();
		assertEquals(expected , actual);
		System.out.println(actual);
	}

}
