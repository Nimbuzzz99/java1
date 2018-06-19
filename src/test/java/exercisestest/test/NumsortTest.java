package test.java.exercisestest.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import main.java.exercises.*;

public class NumsortTest {
    Numsort foo = null;
	@Before
	public void setUp() throws Exception {
		foo = new Numsort();
	}

	@After
	public void tearDown() throws Exception {
		foo = null;
	}

	@Test
	public void testSortNum() {
		int []exp = {1,2,3,4,5};
		int []act = foo.sortNum(14235);
		assertEquals(exp ,act);
	}

}
