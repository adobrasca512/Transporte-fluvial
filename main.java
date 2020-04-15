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
  mercancia.getNombre().add("Soda");
  mercancia.getNombre().add("Nachos");
  mercancia.getNombre(); 
   mercancia.getPrecio().add(0.01);
   mercancia.getPrecio().add(19.99);
   mercancia.getPrecio().add(55.99);
   mercancia.getPrecio().add(135.99);
   System.out.println(mercancia.getPrecio());
   mercancia.getPeso().add(6.00);
   mercancia.getPeso().add(7.00);
   mercancia.getPeso().add(10.00);
   System.out.println(mercancia.getPeso());
   mercancia.getFechacad().add(dia);
   
  
  
   
   Tripulante tripulante= new Tripulante("Juan Carlos", 66, 1000, "Capitan");
   System.out.println("------------Tripulantes-----------");
   tripulante.getNombre();
   tripulante.getCategoriaTripulante();
   tripulante.getPeso();
   tripulante.getPaga();
   System.out.println("------------Pasajeros-------------");
   
   Pasajeros pasajeros= new Pasajeros("Pedro", 45, "China");
   pasajeros.getNombre();
   pasajeros.getPeso();
   pasajeros.getCiudadto();
   
   System.out.println("------Informacion por viaje------");
   mercancia.MercanciaMax();
	}

}
