package test.java.exercisestest.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import main.java.exercises.*;

public class VowconsTest {
    Vowcons foo = null;
	@Before
	public void setUp() throws Exception {
		foo = new Vowcons(); 
	}

	@After
	public void tearDown() throws Exception {
		foo = null;
	}

	@Test
	public void testVoCo() {
		String expec = "vowelvowel";
		String act = foo.VoCo("aa").toLowerCase();
		assertEquals(expec , act);
	}

}
