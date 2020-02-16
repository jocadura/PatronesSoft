
/**
 * Clase de cafetera electrica que implementa la interfaz CafeteraElectrica.
 * @author José Carlos Dueñas
 *
 */
public class CafeteraNespresso implements CafeteraElectrica {

	@Override
	public void enceder() {
		System.out.println("Se enciende la cafetera NESSPRESO");
		
	}

	@Override
	public void apagar() {
		System.out.println("Se apaga la cafetera NESSPRESO");
	}

	@Override
	public void hacerCafe() {
		System.out.println("Se introduce capsula NESSPRESO y cae el cafe");
	}

}
