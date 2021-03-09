package programmingjunit;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConCatTest {

	@Test
	public void ConCatTest() {
		MyJunit junit = new MyJunit();
		String result = junit.ConCat("hello", "world");
		assertEquals("helloworld", result);
	}

}
