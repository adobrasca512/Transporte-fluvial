package Transporte_Fluvial;
import java.util.*;
public class Mercancias {
private ArrayList<String> nombre;
private ArrayList<Double> peso;
private ArrayList<Double> precio;
private ArrayList<Date> fechacad;

public Mercancias(String nombres,double pesos, double precios, Date fechacads) {
	super();
	this.nombre = nombre;
	this.peso = peso;
	this.precio = precio;
	this.fechacad = fechacad;
	
	nombre= new ArrayList<String>();
	precio= new ArrayList<Double>();
	fechacad= new ArrayList<Date>();
	peso= new ArrayList<Double>();
	nombre.add("Coca cola");
	precio.add(2.99);
	peso.add(2.33);
	fechacad.add(new Date(3,2,1999));
}

public ArrayList<String> getNombre() {
	
	
	return nombre;
}
public void setNombre(ArrayList<String> nombre) {
	this.nombre = nombre;
}

public ArrayList<Double> getPrecio() {

	
		
	
	return precio;
}
public void setPrecio(ArrayList<Double> precio) {
	this.precio = precio;
}
public ArrayList<Date> getFechacad() {

	return fechacad;
}
public void setFechacad(ArrayList<Date> fechacad) {
	this.fechacad = fechacad;
}

public ArrayList<Double> getPeso() {
	
	return peso;
}
public void setPeso(ArrayList<Double> peso) {
	this.peso = peso;
}
public void imprimir() {
	ListIterator iterador= nombre.listIterator();
	ListIterator iterador1= peso.listIterator();
	ListIterator iterador2= precio.listIterator();
	ListIterator iterador3= fechacad.listIterator();
	int i=0;
	while(iterador.hasNext() && iterador1.hasNext() && iterador2.hasNext() && iterador3.hasNext()) {
		i++;
		System.out.println("Producto: " +iterador.next());
		System.out.println("Precio (€): " +iterador1.next());
		System.out.println("Peso (Kg): " +iterador2.next());
		System.out.println("Fecha caducidad: "+iterador3.next());
		System.out.println("._._._._._._._._._._._._._._._._._");
	}
}
public void MercanciaMax() {
	double valormin=Integer.MAX_VALUE;
	double valormax=Integer.MIN_VALUE;
	int i_minimo=0;
	int i_maximo=0;
	for(int i=0;i<precio.size();i++) {
		if(precio.get(i)<valormin) {
			valormin= precio.get(i);
			i_minimo=i;
		}
		if(precio.get(i)>valormax) {
			valormax=precio.get(i);
			i_maximo=i;
		}
		
	}
	
	
		
		System.out.println("El producto: "+nombre.get(i_minimo)+ " dio un valor minimo de: " +valormin  );
	
	
	System.out.println("El producto: "+nombre.get(i_maximo)+ " dio valor maximo de: " +valormax );
	
}
}
