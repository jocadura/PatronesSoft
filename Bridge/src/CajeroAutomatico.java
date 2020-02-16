/**
 * Clase abstracta que define las operaciones que se pueden realizar en un cajero.
 * Incluye referencia al implementador al cual podemos solicitarle operaciones concretas
 * según vayamos necesitando en tiempo ejecucion.
 * 
 * Existen dos tipos de cajeros automaticos FULL y CASH
 * Los tipo full permiten retirar y depositar dinero
 * Los tipo cash solo pueden retirar dinero.
 * 
 * @author JC
 *
 */
public abstract class CajeroAutomatico {

	// Referencia al implementador
	protected Banco banco;
	
	public CajeroAutomatico(Banco banco) {
		this.banco = banco;
	}
		
	public abstract void extraerDinero (boolean cajeroDelBanco);
	public abstract void realizarDeposito (int cantidad);
	
	
	public void realizarRecargaTélefonica () 
	{
		System.out.println("Realizando recarga telefónica...");
		System.out.println ("Operacion realizada por la capa de abstracción");
	}
	
	public void actualizarLibreta ()
	{
		System.out.println("Actualizando los datos de la libreta...");
		System.out.println ("Operacion realizada por la capa de abstracción");
		
	}
	public void actualizarPassword ()
	{
		System.out.println("Actualizando la contraseña de la tajeta bancaria...");
		System.out.println ("Operacion realizada por la capa de implementación");
		
	}
	
}
