package test.java.exercisestest.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import main.java.exercises.*;

public class numberloopTest {
    numberloop foo = null;
	@Before
	public void setUp() throws Exception {
		foo = new numberloop();
	}

	@After
	public void tearDown() throws Exception {
		foo = null;
	}

	@Test
	public void testLoop() {
		String exp = "1223334444";
		String act = foo.loop();
		assertEquals(exp , act);
	}

}
