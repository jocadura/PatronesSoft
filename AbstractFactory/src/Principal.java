/**
 * Cliente que consume la factoria de componentes de viajes
 * @author JC
 *
 */
public class Principal {

	public static void main(String[] args) 
	{
	  // factoria abstracta	
      FactoriaComponentes factoria;
      // interfaz para los productos
      Hotel hotelEnAmerica;
      Transporte transporteAmerica;
      // usamos una factoria concreta para crear los productos
      factoria = new FactoriaAmerica();
      // creamos el producto concreto
      hotelEnAmerica = factoria.crearHotel().setUbicacion("Los Angeles").setTipo("Urbano").setCategoria("***");
   	  transporteAmerica = factoria.crearTransporte().setTipo("Aereo").setOrigen("Madrid").setDestino("Los Angeles");
   	  
   	  //salida por consola
      System.out.println ("Creado un hotel en "
            + hotelEnAmerica.getUbicacion()
            + " de tipo " + hotelEnAmerica.getTipo()
            + " y de categoria " + hotelEnAmerica.getCategoria() + " estrellas ");
      System.out.println ("Creado transporte de tipo "
              + transporteAmerica.getTipo()
              + " con origen en " + transporteAmerica.getOrigen()
              + " y destino a " + transporteAmerica.getDestino());
     }
 }
