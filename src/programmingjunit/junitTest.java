package programmingjunit;

import static org.junit.Assert.*;

import org.junit.Test;

public class junitTest {

	@Test
	public void test() {
		MyJunit junit = new MyJunit();
		int result = junit.add(200, 400);
		assertEquals(600, result);
	}

}
