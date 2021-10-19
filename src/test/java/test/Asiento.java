package test;

public class Asiento {
	
	public String color;
	int precio;
	int registro;
	
	void cambiarColor(String color) {
		
		if (color.equals("rojo") || color.equals("amarillo") || color.equals("verde") || color.equals("blanco") || color.equals("negro")){
				this.color=color;
		} 
		
	}
}

