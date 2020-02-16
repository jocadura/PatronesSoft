/**
 * Cajero automatico que permite solo la retirada de efectivo.
 * @author JC
 *
 */
public class CajeroCash  extends CajeroAutomatico{

	public CajeroCash(Banco banco) {
		super(banco);
	}
	
    /**
     * Operación de extración de dinero
     * @param cajeroDelBanco: indica si el cajero pertenece al banco
     */
	@Override
	public void extraerDinero(boolean cajeroDelBanco) {
		
		System.out.println ("Solicitud extracción de dinero...");	
		System.out.println ("Realizando petición a su banco ...");
		super.banco.extraerDineroCajero(false);
		
	}

	/**
	* Operación de ingreso en efectivo no permitada en cajeros de este tipo
	*/
	@Override
	public void realizarDeposito(int cantidad) {
		
		    System.out.println ("Solicitud de deposito de dinero...");	
			System.out.println("No esta permitido el deposito de dinero, acuda a su cajero mas cercano");
			System.out.println ("Operacion realizada por la capa de implementación");
	}

}
