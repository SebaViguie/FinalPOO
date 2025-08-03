package finalPOO;

import finalPOO.Classes.Maquina;
import finalPOO.Interfaces.Regalo;

public class Main {

	public static void main(String[] args) {
		Maquina maquinaDeSuenios = new Maquina();

		maquinaDeSuenios.hacerFuncionar();
		maquinaDeSuenios.mostrarCaracteristicas();
		
		Regalo unaBici = maquinaDeSuenios.generarRegalo(1);
		Regalo unOso = maquinaDeSuenios.generarRegalo(2);
		
		maquinaDeSuenios.total();
	}
}