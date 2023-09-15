package fes.aragon.utilerias.dinamicas.listasimple;

public class ListaDoble <E> {
	protected Nodo<E> cabeza, cola, n;
	protected int longitud = 0;
	
	public ListaDoble(){
		cabeza = cola = null;	
	}
	
	public void agregarEnCabeza(E dato) {
		n = new Nodo<E>(dato, cabeza, cola);
		if (cola == null) {
			cola = cabeza = n;
		} else {
			n.setSiguiente(cabeza);
			cabeza.setAnterior(n);
			cabeza = n;
		}
		longitud ++;
	}
	
	public void agregarEnCola(E dato) {
		n = new Nodo<E>(dato);
		if (cabeza == null) {
			cabeza = cola = n;
		} else {
			n.setAnterior(cola);
			cola.setSiguiente(n);
			cola = n;
		}
		longitud++;
	}
	
	public void imprimirElementos() {
		for (Nodo<E> tmp = cabeza; tmp != null; tmp = tmp.getSiguiente()) {
			System.out.println(tmp.getDato());
		}
	}
	
}
