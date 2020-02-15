import java.util.ArrayList;

/**
 * Responsable de guardar en lugar seguro el MEMENTO
 * Creamos un listado de MEMENTOS, uno para cada cuarto que contiene el resultado
 * para cada equipo y el cuarto en el que se produjo.
 * No examina ni opera con los contenidos del MEMENTO
 * SE CORRESPONDE CON EL OBJETO CONSERJE (CARETAKER)
 * @author JC
 *
 */
public class Marcador {

	private ArrayList <Memento> resultadoCuarto;

	/**
	 * Constructor del marcardor que crea un ArrayList con los marcadores producidos
	 * en cada cuarto del partido u prorrogas si las hubiese.
	 */
	public Marcador() {
		this.resultadoCuarto = new ArrayList<Memento>();
	}
	
	/**
	 * Recupera el estado del marcador para un cuarto determinado
	 */
	public Memento getMarcador(int numeroCuarto) {
		return resultadoCuarto.get(numeroCuarto);
	}

	/**
	 * Guarda el resultado de un cuarto
	 * @param tanteoPartidoPorCuarto
	 */
	public void setMarcador(Memento tanteoPartidoPorCuarto)
	{
		this.resultadoCuarto.add(tanteoPartidoPorCuarto);
	}
}
