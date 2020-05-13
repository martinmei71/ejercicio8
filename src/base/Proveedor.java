package base;
/**
 * @version (Alpha) 0.1a 
 * @author martinmeizosomartinez
 *
 */
public class Proveedor implements  Suminista, Cobra {

	private String nif;
	private String razon;
	/**
	 * Metodo Constructor
	 * @param nif El dni String 
	 * @param razon String para determinar la razon
	 */
	public Proveedor(String nif, String razon) {
		super();
		this.nif = nif;
		this.razon = razon;
	}
	
	
	
	
}
