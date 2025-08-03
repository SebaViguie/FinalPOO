package finalPOO.Classes;

import finalPOO.Interfaces.Regalo;

public class Bicicleta implements Regalo {
	
	public Bicicleta(int ruedasAuxiliares) {
		this.ruedasAuxiliares = ruedasAuxiliares;
	}

	private int ruedasAuxiliares;
	
	public int getRuedasAuxiliares() {
		return this.ruedasAuxiliares;
	}
	
	@Override
	public void funcionar() {
		System.out.println("La bicicleta anda");		
	}

	@Override
	public int costoSuenio(int valor) {
		return valor*150;
	}
}