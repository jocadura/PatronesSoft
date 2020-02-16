/**
 * Factoria concreta que se encarga de crear los diferentes objetos
 * @author JC
 *
 */
public class FactoriaEuropa implements FactoriaComponentes{

	public FactoriaEuropa() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Hotel crearHotel() {
		// TODO Auto-generated method stub
		return new HotelEuropa ();
	}

	@Override
	public Transporte crearTransporte() {
		// TODO Auto-generated method stub
		return new TransporteEuropa ();
	}
}
