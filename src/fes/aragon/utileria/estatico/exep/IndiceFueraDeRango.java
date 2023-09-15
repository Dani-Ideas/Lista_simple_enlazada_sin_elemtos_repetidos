package fes.aragon.utileria.estatico.exep;

public class IndiceFueraDeRango extends Exception{

	private static final long serialVersionUID = 1L;
	
	/**
	 * 
	 * 
	 * @param msg indica que mensaje se mostrara
	 */
	public IndiceFueraDeRango(String msg) {
		super(msg);
	}
}