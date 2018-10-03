package org.tfg.som.holamundo;


import org.junit.Assert;
import org.junit.Test;





public class HolaMundoTest{
	@Test
	public void test1() {
		HolaMundo hi = new HolaMundo("Holi");
		Assert.assertTrue("Correcto","Holi".equals(hi.getHolaMundo(10)));
	}
	@Test
	public void test2() {
		HolaMundo hi = new HolaMundo("Holi");

		Assert.assertTrue("Correcto","adios".equals(hi.getHolaMundo(1)));
	}
}
