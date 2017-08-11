package first;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FirstTest {

	@Test
	public void testMethod1() {
		assertTrue("intをStringに変換", "100".equals("" + 100));
		System.out.println("testMethod1");
	}

	@Test
	public void testMethod2() {
		assertEquals("100", "" + 100);
		assertEquals("余りは0", 0,  9 % 3);
		System.out.println("testMethod2");
	}

	@Test
	public void testMethod3() {
		//fail("例外が発生するべき！！");
		//String abc = new String("ABC");
		String abc = "ABC";
		assertSame("同じオブジェクト", "ABC", abc);
		assertNotSame("違うオブジェクト", "ABC", new String("ABC"));
		System.out.println("testMethod3");
	}

	@Before
	public void testBefore() {
		System.out.println("testBefore");
	}

	@After
	public void testAfter() {
		System.out.println("testAfter");
	}
}
