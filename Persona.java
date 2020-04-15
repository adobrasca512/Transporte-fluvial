package Transporte_Fluvial;

public class Persona {
private String nombre;
private double peso;



public Persona(String nombre, double peso) {
	super();
	this.nombre = nombre;
	this.peso = peso;
	
}



public String getNombre() {
	System.out.println("Nombre: " +nombre);
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public double getPeso() {
	System.out.println("Peso (kg): " +peso);
	return peso;
}
public void setPeso(double peso) {
	this.peso = peso;
}
}
