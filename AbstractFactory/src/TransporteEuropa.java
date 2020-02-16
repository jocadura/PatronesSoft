/**
 * Clase de tranporte del continente europeo.
 * Se establecen y obtienen las propiedades necesarias
 * @author JC
 *
 */
public class TransporteEuropa extends Transporte{

	private String origen;
    private String destino;
    private String tipo;
    
	public TransporteEuropa() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Transporte setOrigen(String origen) {
		this.origen = origen;
		return this;
	}

	@Override
	public Transporte setDestino(String destino) {
		this.destino = destino;
		return this;
	}

	@Override
	public Transporte setTipo(String tipo) {
		this.tipo = tipo;
		return this;
	}

	@Override
	public String getOrigen() {
		// TODO Auto-generated method stub
		return this.origen;
	}

	@Override
	public String getDestino() {
		// TODO Auto-generated method stub
		return this.destino;
	}

	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return this.tipo;
	}
}
