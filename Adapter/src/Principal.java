/**
 * Cliente que utiliza la solución planteada
 * @author José Carlos Dueñas
 *
 */
public class Principal {

	public static void main(String[] args) {
		
		// Preparamos un cafe clasico
		System.out.println("Café Clásico , se muestra proceso realizado :");
		CafeteraElectrica cafetera = new CafeteraAdaptador();
		cafetera.enceder();
		cafetera.hacerCafe();
		cafetera.apagar();
		
		System.out.println("Café Eléctrico, se muestra proceso realizado :");
		//CafeteraElectrica  cafeteraNespresso = new CafeteraNespresso();
		cafetera = new CafeteraNespresso();
		cafetera.enceder();
		cafetera.hacerCafe();
		cafetera.apagar();
	}

}
