package test;

public class Auto {
	
	
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	

	int cantidadAsientos() {
		int cont = 0;
		for (int i = 0; i < asientos.length; i++) {
			if (asientos[i]!=null)
			  cont++;
		}
		
		return cont;
		}

	
	
	String verificarIntegridad() {
		//Auto auto = new Auto();
		if (this.registro == motor.registro){
			if (registro == asientos.length)
				return "Auto original";
		}
		return "Las piezas no son originales";
		
	}
		
}
