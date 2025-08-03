package finalPOO.Classes;

import finalPOO.Interfaces.Regalo;

public class OsoPeluche implements Regalo {
	
	public OsoPeluche(boolean mueveOjos) {
		this.mueveOjos = mueveOjos;
	}
	
	private boolean mueveOjos;	
	
	public boolean getMueveOjos() {
		return this.mueveOjos;
	}
	
	@Override
	public void funcionar() {
		System.out.println("El oso habla");		
	}

	@Override
	public int costoSuenio(int valor) {
		return valor+30;
	}
}