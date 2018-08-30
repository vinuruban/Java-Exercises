package com.qa.mvn.blaa;

import org.junit.Assert;
import org.junit.Test;

public class BlackJacktest {
	
	intermediate aname = new intermediate();
	
	@Test
	public void test() {
		Assert.assertEquals(0,aname.blackJack(4,4));
	}

}
