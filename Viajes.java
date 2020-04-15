package Transporte_Fluvial;
import java.util.*;
public class Viajes {
protected Mercancias ganancias;
protected Mercancias perdidas;
protected ArrayList<String> destinos;
protected ArrayList<Double> preciosdestinos;
protected String destino;
protected double preciosdestino;
public Viajes(Mercancias ganancias, Mercancias perdidas, String destino,
		double preciosdestino) {
	super();
	this.ganancias = ganancias;
	this.perdidas = perdidas;
	this.destinos = destinos;
	this.destino=destino;
	this.preciosdestinos = preciosdestinos;
	this.preciosdestino=preciosdestino;
	destinos= new ArrayList<String>();
	destinos.add(destino);
	preciosdestinos= new ArrayList<Double>();
	preciosdestinos.add(preciosdestino);
}
public Mercancias getGanancias() {
	return ganancias;
}
public void setGanancias(Mercancias ganancias) {
	this.ganancias = ganancias;
}
public Mercancias getPerdidas() {
	return perdidas;
}
public void setPerdidas(Mercancias perdidas) {
	this.perdidas = perdidas;
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
}
