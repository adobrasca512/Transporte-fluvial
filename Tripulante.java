package Transporte_Fluvial;

public class Tripulante extends Persona {
private double paga;
private String categoriaTripulante;






public Tripulante(String nombre, double peso, double paga, String categoriaTripulante) {
	super(nombre, peso);
	this.paga = paga;
	this.categoriaTripulante = categoriaTripulante;
}

public String getCategoriaTripulante() {
	System.out.println("Tripulante de categoria: " +categoriaTripulante);
	return categoriaTripulante;
}

public void setCategoriaTripulante(String categoriaTripulante) {
	this.categoriaTripulante = categoriaTripulante;
}

public double getPaga() {
	System.out.println("Paga: "+paga );
	return paga;
}

public void setPaga(double paga) {
	this.paga = paga;
}
}
