package org.tfg.som.holamundo;

import org.junit.Test;

import junit.framework.Assert;

public class HolaMundoTest {
	@Test
	public void getHolaMundoTest() {
		HolaMundo hi = new HolaMundo("Holi");
		Assert.assertEquals("Holi", hi.getHolaMundo());
	}
}
