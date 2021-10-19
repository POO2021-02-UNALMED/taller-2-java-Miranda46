package automovil;

public class Asiento {
	
	String color;
	int precio;
	int registro;
	
	void cambiarColor(String color) {
		
		if (this.equals("rojo") || this.equals("amarillo") || this.equals("verde") || this.equals("blanco") || this.equals("negro")){
				this.color=color;
		} 
		
	}
}
