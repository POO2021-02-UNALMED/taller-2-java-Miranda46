package test;

public class Auto {
	
	
	String modelo;
	int precio;
	Asiento[] asiento;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	

	int cantidadAsientos() {
		int cont = 0;
		for (int i = 0; i < asiento.length; i++) {
			if (asiento[i]!=null)
			  cont++;
		}
		
		return cont;
		}

	
	
	String verificarIntegridad() {
		//Auto auto = new Auto();
		if (this.registro == motor.registro){
			if (registro == asiento.length)
				return "Auto original";
		}
		return "Las piezas no son originales";
		
	}
		
}
