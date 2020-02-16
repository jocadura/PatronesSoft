/**
 * Clase de hotel del continente americano.
 * Se establecen y obtienen las propiedades necesarias
 * @author JC
 *
 */
public class HotelEuropa extends Hotel{

    private String ubicacion;
    private String categoria;
    private String tipo;
    
	public HotelEuropa() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Hotel setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
		return this;
	}

	@Override
	public Hotel setCategoria(String categoria) {
		this.categoria = categoria;
		return this;
	}

	@Override
	public Hotel setTipo(String tipo) {
		this.tipo = tipo;
		return this;
	}

	@Override
	public String getUbicacion() {
		// TODO Auto-generated method stub
		return this.ubicacion;
	}

	@Override
	public String getCategoria() {
		// TODO Auto-generated method stub
		return this.categoria;
	}

	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return this.tipo;
	}

}
