package Transporte_Fluvial;
import java.util.*;
public class Viajes {
protected Mercancias gananciasYperdidas;

protected ArrayList<String> destinos;
protected ArrayList<Double> preciosdestinos;
protected String destino;
protected double preciosdestino;
public Viajes( String destino,
		double preciosdestino) {
	super();
	
	this.destinos = destinos;
	this.destino=destino;
	this.preciosdestinos = preciosdestinos;
	this.preciosdestino=preciosdestino;
	destinos= new ArrayList<String>();
	preciosdestinos= new ArrayList<Double>();
	destinos.add(destino);
	preciosdestinos.add(preciosdestino);
	
	
	
}


public Mercancias getGananciasYperdidas() {
	return gananciasYperdidas;
}


public void setGananciasYperdidas(Mercancias gananciasYperdidas) {
	this.gananciasYperdidas = gananciasYperdidas;
}


public void getAñadirdestinos(String destino,double preciosdestino) {
	try {
		if(destinos.size()<=5 && preciosdestinos.size()<=5) {
			destinos.add(destino);
			preciosdestinos.add(preciosdestino);	
		}
		
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("Ya no se aceptan mas destinos.");
		
	}
	
	
}

public ArrayList<String> getDestinos() {
	
	return destinos;
}
public void setDestinos(ArrayList<String> destinos) {
	this.destinos = destinos;
}
public ArrayList<Double> getPreciosdestinos() {
	return preciosdestinos;
}
public void setPreciosdestinos(ArrayList<Double> preciosdestinos) {
	this.preciosdestinos = preciosdestinos;
}
public void imprimirdestinosYprecio() {
	ListIterator iterador=  destinos.listIterator();
	ListIterator iterador2=  preciosdestinos.listIterator();
	int i=0;
	while(iterador.hasNext() && iterador2.hasNext()) {
		i++;
		System.out.println("Destino ( "+i +" ): "+iterador.next() );
		System.out.println("Precio: "+iterador2.next() );
	}
}
public boolean getVerificarViaje(Pasajeros pasajero) {

	String pais= pasajero.getCiudadto();
	
	
	return destinos.contains(pais);
	
}
public void getConfirmarVerificacion(Pasajeros pasajero) {
	
	boolean verificacion=getVerificarViaje(pasajero);
	if(verificacion==true) {
		System.out.println("Viaje Validado.\u2714");
	}else {
		System.out.println("No se encuentran destinos para esta ciudad.\u2639");
	}
	System.out.println();
}

}
