package org.tfg.som.holamundo;


import org.junit.Assert;
import org.junit.Test;





public class HolaMundoTest{
	@Test
	public void getHolaMundo() {
		HolaMundo hi = new HolaMundo("Holi");
		Assert.assertEquals("Holi",hi.getHolaMundo());
	}
}
