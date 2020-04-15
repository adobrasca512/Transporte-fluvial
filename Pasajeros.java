package Transporte_Fluvial;

import java.util.ListIterator;

public class Pasajeros extends Persona {


private String ciudadto;


public Pasajeros(String nombre, double peso, String ciudadto) {
	super(nombre, peso);
	this.ciudadto = ciudadto;
}

public String getCiudadto() {
	System.out.println("Ciudad destino: " +ciudadto);

	
	return ciudadto;
}
public void setCiudadto(String ciudadto) {
	this.ciudadto = ciudadto;
}

}
