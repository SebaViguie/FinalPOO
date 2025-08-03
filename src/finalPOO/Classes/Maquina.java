package finalPOO.Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import finalPOO.Interfaces.Regalo;

public class Maquina {
	
	public Maquina() {
		for (int i = 0; i < 10; i++) {
			if (i<5) {
				regalos.add(new Bicicleta(2));
			} else {
				regalos.add(new OsoPeluche(true));
			}
		}
	}

	private List<Regalo> regalos = new ArrayList<Regalo>();
	
	public void hacerFuncionar() {
		for (Regalo regalo : regalos) {
			regalo.funcionar();
		}
	}
	
	public void mostrarCaracteristicas() {
		for (int i = 0; i < regalos.size(); i++) {
			
			if(regalos.get(i) instanceof Bicicleta) {
				Bicicleta bici = (Bicicleta) regalos.get(i);
				
				System.out.println(String.format("Regalo %d: %d ruedas auxiliares",i+1, bici.getRuedasAuxiliares()));
			} else {
				OsoPeluche oso = (OsoPeluche) regalos.get(i);
				
				if(oso.getMueveOjos()) {
					System.out.println(String.format("Regalo %d: Mueve los ojos", i+1));
				} else {
					System.out.println(String.format("Regalo %d: No mueve los ojos", i+1));
				}				
			}
		}
	}
	
	public Regalo generarRegalo(int valor) {
		if (valor == 1) {
			return new Bicicleta(2);
		} else if (valor == 2) {
			return new OsoPeluche(true);
		} else {
			throw new IllegalArgumentException("El valor debe ser 1 o 2");
		}
	}
	
	public void total() {		
		Random random = new Random();
		
		int total = regalos.stream().mapToInt(r -> r.costoSuenio(random.nextInt(10)+1)).sum();
		
		System.out.println(String.format("El total es %d", total));
	}
}