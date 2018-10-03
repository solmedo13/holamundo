package org.tfg.som.holamundo;


import org.junit.Assert;
import org.junit.Test;





public class HolaMundoTest{
	@Test
	public void getHolaMundo() {
		HolaMundo hi = new HolaMundo("Holi");
		Assert.assertTrue("Correcto","Holi".equals(hi.getHolaMundo(10)));
		Assert.assertTrue("Correcto","adios".equals(hi.getHolaMundo(1)));
	}
}
