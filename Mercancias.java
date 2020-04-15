package Transporte_Fluvial;
import java.util.*;
public class Mercancias {
private ArrayList<String> nombre;
private ArrayList<Double> peso;
private ArrayList<Double> precio;
private ArrayList<Date> fechacad;
private String nombres;
private double pesos;
private double precios;
private Date fechacads;
public Mercancias(String nombres,double pesos, double precios, Date fechacads) {
	super();
	this.nombre = nombre;
	this.peso = peso;
	this.precio = precio;
	this.fechacad = fechacad;
	this.nombres = nombres;
	this.pesos = pesos;
	this.precios = precios;
	this.fechacads = fechacads;
	nombre= new ArrayList<String>();
	precio= new ArrayList<Double>();
	fechacad= new ArrayList<Date>();
	peso= new ArrayList<Double>();
	nombre.add(nombres);
	precio.add(precios);
	fechacad.add(fechacads);
	peso.add(pesos);
}
public double getPrecios() {
//System.out.println("Precios: " +precios);
	return precios;
}
public void setPrecios(double precios) {
	this.precios = precios;
}
public String getNombres() {
	
	return nombres;
}
public double getPesos() {
	//System.out.println("Peso (Kg): " +pesos);
	return pesos;
}
public void setPesos(double pesos) {
	this.pesos = pesos;
}
public Date getFechacads() {
	return fechacads;
}
public void setFechacads(Date fechacads) {
	this.fechacads = fechacads;
}
public void setNombres(String nombres) {
	this.nombres = nombres;
}
public ArrayList<String> getNombre() {
	
	
	
	for(int i=0;i<nombre.size();i++) {
		
		System.out.println("Producto: " +nombre.get(i));
		
	}
	return nombre;
}
public void setNombre(ArrayList<String> nombre) {
	this.nombre = nombre;
}

public ArrayList<Double> getPrecio() {
ListIterator iterador= precio.listIterator(); 
int i=0;
 while(iterador.hasNext()) {
	 i++;
	 System.out.println("Precio (€): " +iterador.next());
 }
	
		
	
	return precio;
}
public void setPrecio(ArrayList<Double> precio) {
	this.precio = precio;
}
public ArrayList<Date> getFechacad() {
for(int i=0;i<fechacad.size();i++) {
	System.out.println("Producto caducidad: " +fechacad);
	}
	
	return fechacad;
}
public void setFechacad(ArrayList<Date> fechacad) {
	this.fechacad = fechacad;
}

public ArrayList<Double> getPeso() {
	
	for(int i=0;i<peso.size();i++) {
		System.out.println("Peso (Kg): " +peso.get(i));
		}
	return peso;
}
public void setPeso(ArrayList<Double> peso) {
	this.peso = peso;
}
public void MercanciaMax() {
	double valormin=Integer.MAX_VALUE;
	double valormax=Integer.MIN_VALUE;
	for(int i=0;i<precio.size();i++) {
		if(precio.get(i)<valormin) {
			valormin= precio.get(i);
		}
		if(precio.get(i)>valormax) {
			valormax=precio.get(i);
		}
		
	}
	System.out.println("El que dio valor minimo fue: " +valormin);
	System.out.println("El que dio valor maximo fue: " +valormax);
	
}
}
