package automovil;

public class Motor {

	int numeroCilindros;
	String tipo;
	int registro;
	

	void cambiarRegistro(int registro) {
		this.registro=registro;
	}
	
	void asignarTipo(String tipo) {
		if (this.tipo.equals("electrico") || this.tipo.equals("gasolina"))
			this.tipo=tipo;
	}
}
