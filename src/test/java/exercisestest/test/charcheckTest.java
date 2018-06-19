package test.java.exercisestest.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import main.java.exercises.*;

public class charcheckTest {
    charcheck foo = null;
	@Before
	public void setUp() throws Exception {
		foo = new charcheck();
	}

	@After
	public void tearDown() throws Exception {
		foo = null;
	}

	@Test
	public void testCasecheck() {
		String expec = "lowercase";
		String act = foo.casecheck('a').toLowerCase();
		assertEquals(expec , act);
		
	}

}
