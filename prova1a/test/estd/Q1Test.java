package estd;

import org.junit.Assert;
import org.junit.Test;

public class Q1Test {

	@Test
	public void q1Test() {
		Q1 q = new Q1();
		int[] n = { 1, 3, 0, 3, 2 };
		boolean result = q.q1(n);
		Assert.assertTrue(result);
	}

}
