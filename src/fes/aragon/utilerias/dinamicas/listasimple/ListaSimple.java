package fes.aragon.utilerias.dinamicas.listasimple;

public class ListaSimple<E> {

	protected Nodo<E> header, cola;
	protected int longitud = 0;
	
	public ListaSimple() {
		header=cola=null;
	}
	
	public void agraegarEnCabeza(E dato) {
		header = new Nodo<E>(dato, header);
		if (cola == null) {
			
		}
	}
}
