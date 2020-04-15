package Transporte_Fluvial;
import java.util.*;
public class Barca {
private String nombrebarca;
private double capacidadcarga;
private int capacidadpersonas;
private int capacidadmercancias;
private Mercancias mercancias;
private Persona personas;
public Barca(String nombrebarca, double capacidadcarga, int capacidadpersonas, int capacidadmercancias) {
	super();
	this.nombrebarca = nombrebarca;
	this.capacidadcarga = capacidadcarga;
	this.capacidadpersonas = capacidadpersonas;
	this.capacidadmercancias = capacidadmercancias;
	this.mercancias = mercancias;
	this.personas = personas;
	this.personas=personas;
}
public String getNombrebarca() {
	return nombrebarca;
}
public void setNombrebarca(String nombrebarca) {
	this.nombrebarca = nombrebarca;
}
public double getCapacidadcarga() {
	return capacidadcarga;
}
public void setCapacidadcarga(double capacidadcarga) {
	this.capacidadcarga = capacidadcarga;
}
public int getCapacidadpersonas() {
	return capacidadpersonas;
}
public void setCapacidadpersonas(int capacidadpersonas) {
	this.capacidadpersonas = capacidadpersonas;
}
public int getCapacidadmercancias() {
	return capacidadmercancias;
}
public void setCapacidadmercancias(int capacidadmercancias) {
	this.capacidadmercancias = capacidadmercancias;
}
public Mercancias getMercancias() {
	return mercancias;
}
public void setMercancias(Mercancias mercancias) {
	this.mercancias = mercancias;
}
public Persona getPersonas() {
	return personas;
}
public void setPersonas(Persona personas) {
	this.personas = personas;
}

}
