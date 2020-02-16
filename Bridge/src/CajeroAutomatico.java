/**
 * Clase abstracta que define las operaciones que se pueden realizar en un cajero.
 * Incluye referencia al implementador al cual podemos solicitarle operaciones concretas
 * seg�n vayamos necesitando en tiempo ejecucion.
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
	
	
	public void realizarRecargaT�lefonica () 
	{
		System.out.println("Realizando recarga telef�nica...");
		System.out.println ("Operacion realizada por la capa de abstracci�n");
	}
	
	public void actualizarLibreta ()
	{
		System.out.println("Actualizando los datos de la libreta...");
		System.out.println ("Operacion realizada por la capa de abstracci�n");
		
	}
	public void actualizarPassword ()
	{
		System.out.println("Actualizando la contrase�a de la tajeta bancaria...");
		System.out.println ("Operacion realizada por la capa de implementaci�n");
		
	}
	
}
