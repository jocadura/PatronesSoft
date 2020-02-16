/**
 * Cliente que utiliza la soluci�n planteada
 * @author Jos� Carlos Due�as
 *
 */
public class Principal {

	public static void main(String[] args) {
		
		// Preparamos un cafe clasico
		System.out.println("Caf� Cl�sico , se muestra proceso realizado :");
		CafeteraElectrica cafetera = new CafeteraAdaptador();
		cafetera.enceder();
		cafetera.hacerCafe();
		cafetera.apagar();
		
		System.out.println("Caf� El�ctrico, se muestra proceso realizado :");
		//CafeteraElectrica  cafeteraNespresso = new CafeteraNespresso();
		cafetera = new CafeteraNespresso();
		cafetera.enceder();
		cafetera.hacerCafe();
		cafetera.apagar();
	}

}
