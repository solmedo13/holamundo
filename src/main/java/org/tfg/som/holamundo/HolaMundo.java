package org.tfg.som.holamundo;

public class HolaMundo {
	private String holaMundo;

	public HolaMundo(String texto) {
		this.holaMundo = texto;
	}
	public String getHolaMundo(int opc) {
		switch (opc) {
		case 1: return "adios";
		default: return holaMundo;
		}
	
	}
}
