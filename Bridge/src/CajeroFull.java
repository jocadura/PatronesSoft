/**
 *  Los tipo full permiten retirar y depositar dinero
 *  @author JC
 *
 */
public class CajeroFull extends CajeroAutomatico {

	
	public CajeroFull(Banco banco) {
		super(banco);
	}
	
    /**
     * Operación de extración de dinero
     * @param cajeroDelBanco: indica si el cajero pertenece al banco
     */
	@Override
	public void extraerDinero(boolean cajeroDelBanco) {
		System.out.println ("Solicitud extracción de dinero en cajero");	
		System.out.println ("Realizando peticion a su banco...");
		super.banco.extraerDineroCajero(cajeroDelBanco);
	}
	
   /**
    * Operación de ingreso en efectivo
    * @param cantidad: el deposito se puede realizar según la cantidad y la entidad bancaria
    * 
    */
	@Override
	public void realizarDeposito(int cantidad) {
	    System.out.println ("Solicitud de deposito de dinero en cajero");	
		System.out.println ("Realizando petición a su banco ...");
		super.banco.depositarDinero(cantidad);	
	}

}
