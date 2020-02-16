/**
 * Clase de la capa de implementación.
 * @author JC
 *
 */
public class BancoSantander implements Banco {

	public BancoSantander() {
		System.out.println ("Bienvenido al Santander");
	}
	@Override
	public void extraerDineroCajero(boolean cajeroPropio) {
		  if (!cajeroPropio) 
	       {
			System.out.println ("El Santander te cobrara una comision  de 6 euros por la operacion");
		   }
	       else 
	       {
	    	   System.out.println ("Operacion libre de comision");
		   }
			
		   System.out.println ("Realizada por la capa de implementación");
	}

	@Override
	public void depositarDinero(int cantidad) 
	{
		if (cantidad >= 750) 
	       {
			System.out.println ("Para ingresos superiores a 750 euros acuda a su sucursal del SANTANDER mas cercana.Gracias !!!");
		   }
	       else 
	       {
	    	   System.out.println ("Operación realizada, gracias por usar este servicio.");
		   }
		
		   System.out.println ("Realizada por la capa de implementación");
	}

	@Override
	public void solicitarPlandePensiones() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void solicitarHipoteca() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void solicitarTarjetaCredito() {
		// TODO Auto-generated method stub
		
	}

}
