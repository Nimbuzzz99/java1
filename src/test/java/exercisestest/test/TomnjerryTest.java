package test.java.exercisestest.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import main.java.exercises.*;


public class TomnjerryTest {
    Tomnjerry foo = null;
	@Before
	public void setUp() throws Exception {
		foo = new Tomnjerry();
	}

	@After
	public void tearDown() throws Exception {
		foo = null;
	}

	@Test
	public void testLooney() {
		String expec = "tom";
		String act = foo.Looney(21).toLowerCase();
		assertEquals(expec , act);
	}

}
