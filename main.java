package Transporte_Fluvial;
import java.util.*;

public class main {

	public static void main(String[] args) {
		System.out.println("------------Embarcación-----------");
		Barca barca = new Barca("Cristobal Colon", 55, 1000, 5000);
   System.out.println("Barca: " +barca.getNombrebarca());
   System.out.println("Peso (Toneladas): " +barca.getCapacidadcarga());
   System.out.println("Cantidad de personas: " +barca.getCapacidadpersonas());
   System.out.println("Capacidad de carga (100 kg por objeto): " +barca.getCapacidadmercancias());
   Date dia= new Date(5,12,2000);
   Mercancias mercancia= new Mercancias("Comida", 19.56, 0.03, dia);
   //mercancia.getNombre().add("Vino Tinto");
 
   
   System.out.println("------------Mercancias------------");
   
  mercancia.getNombre().add("Salchichas");
  mercancia.getPrecio().add(0.01);
  mercancia.getPeso().add(6.00);
  mercancia.getFechacad().add(dia);
  mercancia.getNombre().add("Soda");
  mercancia.getPrecio().add(19.99);
  mercancia.getPeso().add(7.00);
  mercancia.getFechacad().add(dia);
  mercancia.getNombre().add("Nachos");
  mercancia.getPrecio().add(10.01);
  mercancia.getPeso().add(20.02);
  mercancia.getFechacad().add(dia);
  mercancia.getNombre().add("Chocolates");
  mercancia.getPrecio().add(55.99);
  mercancia.getPeso().add(135.99);
  mercancia.getFechacad().add(dia);
   mercancia.imprimir();
  
  
   
   Tripulante tripulante= new Tripulante("Juan Carlos", 66, 1000, "Capitan");
   System.out.println("------------Tripulantes-----------");
   tripulante.getNombre();
   tripulante.getCategoriaTripulante();
   tripulante.getPeso();
   tripulante.getPaga();
   System.out.println("------------Pasajeros-------------");
   Viajes viajes= new Viajes("Jamaica", 1200.45);
   viajes.getAñadirdestinos("Chiriqui", 12.99);
   viajes.getAñadirdestinos("España", 1200.99);
   viajes.getAñadirdestinos("Taiwan", 6200.99);
   viajes.getAñadirdestinos("Panamá", 2200.99);
   Pasajeros pasajeros= new Pasajeros("Pedro", 45, "Panamá");
   pasajeros.getNombre();
   pasajeros.getPeso();
   viajes.getConfirmarVerificacion(pasajeros);
  
   
   /*if(viajes.getDestinos().contains(pasajeros.getCiudadto())) {
	   System.out.println("funciona");
	   //No entiendo porque cuando lo hago donde añadi los valores me los encuentra 
   }*/ 
   System.out.println("------Informacion por viaje------");
   System.out.println("\n*GANANCIAS Y PERDIDAS:\n");
   mercancia.MercanciaMax();
   System.out.println("\n*DESTINOS Y PRECIO:\n");
   viajes.imprimirdestinosYprecio();
   
	}

}
