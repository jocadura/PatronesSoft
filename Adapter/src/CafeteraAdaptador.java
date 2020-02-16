/**
 * Clase ADAPTER. 
 * Clase adaptora, implementa la interfaz CafeteraElectrica (Objetivo)
 * Incluye una referencia al objeto ADAPTEE
 * Redirige las peticiones al objeto ADAPTEE
 * @author José Carlos Dueñas
 *
 */
public class CafeteraAdaptador implements CafeteraElectrica {

	private CafeteraClasica cafeteraClasica;
	
	public CafeteraAdaptador() 
	{
		// Instanciamos la clase incompatible
		this.cafeteraClasica = new CafeteraClasica();
	}

	@Override
	public void enceder() {
		
		this.cafeteraClasica.encenderFuego();
		
	}

	@Override
	public void apagar() {
		
		this.cafeteraClasica.apagarFuego();
	}

	@Override
	public void hacerCafe() {
		
		this.cafeteraClasica.ponerCafeFuego();
    }
}
