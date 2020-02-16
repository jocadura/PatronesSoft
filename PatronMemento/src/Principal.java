/**
 * Clase principal que consume el patrón propuesto.
 * Prueba
 * @author JC
 *
 */
public class Principal {

	public static void main(String[] args) {
		
		 System.out.println ("MARCADOR ACB PRUEBA DE SUBIDA");
		 System.out.println ("***************************************************");
		 //Creamos un partido
		 Partido partido = new Partido();
		 // Creamos el  marcador que nos va a guardar el resultado de cada cuarto
		 Marcador marcadorCuarto = new Marcador();
		 
		 // Establecemos los equipos
		  partido.setEquipoLocal("Real Madrid");
		  partido.setEquipoVisitante("Bilbao Basket");
		  
		  // Marcador 1º CUARTO
		  partido.setPeriodoPartido(1);
		  partido.setPuntosEquipoLocal(23);
		  partido.setPuntosEquipoVisitante(25);
		  // establecemos el marcador del primer cuarto
		  marcadorCuarto.setMarcador(partido.crearMemento());

		 // Marcador 2º CUARTO
		  partido.setPeriodoPartido(2);
		  partido.setPuntosEquipoLocal(48);
		  partido.setPuntosEquipoVisitante(33);  
          // establecemos el marcador del segundo cuarto
		  marcadorCuarto.setMarcador(partido.crearMemento());

		  // Recuperamos los datos del primer cuarto
	     partido.RecuperarMemento(marcadorCuarto.getMarcador(0));
		 System.out.println (partido.getEquipoLocal() + "-" + partido.getEquipoVisitante());
		 System.out.println("Resultado en el  " + partido.getPeriodoPartido() + "º cuarto " + partido.getPuntosEquipoLocal() +  " a " + partido.getPuntosEquipoVisitante());
		 // Recuperamos los datos del segundo cuarto
	     partido.RecuperarMemento(marcadorCuarto.getMarcador(1));
	     System.out.println("Resultado en el  " + partido.getPeriodoPartido() + "º cuarto " + partido.getPuntosEquipoLocal() +  " a " + partido.getPuntosEquipoVisitante());
		  
		  // Marcador 3º CUARTO
		  partido.setPeriodoPartido(3);
		  partido.setPuntosEquipoLocal(75);
		  partido.setPuntosEquipoVisitante(73);  
		 // Podemos recuperar el marcador actual
		 System.out.println("Resultado actual en el  " + partido.getPeriodoPartido() + "º cuarto " + partido.getPuntosEquipoLocal() +  " a " + partido.getPuntosEquipoVisitante()); 
	}

}
