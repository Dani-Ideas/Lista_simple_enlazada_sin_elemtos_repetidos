package fes.aragon.utilerias.dinamicas.listasimple;

public class ListaSimple<E> {

	protected Nodo<E> header, cola;
	protected int longitud = 0;
	
	public ListaSimple() {
		header=cola=null;
	}
	
	public void agregarEnCabeza(E inputData) {
		header = new Nodo<E>(inputData, header);
		if (cola == null) {
			cola= header;
		}
		longitud++;
	}
	public void agregarEnCola(E inputData) {
		if (header==null) {
			header= cola= new Nodo<E>(inputData);
		}else {
			cola.setNext(new Nodo<E>(inputData));
			cola = cola.getNext();
		}
		longitud++;
	}
	public void imprimirElemetos() {
		for (Nodo<E> temporal = header; temporal !=null; temporal=temporal.getNext()) {
			System.out.println(temporal.getData());
		}
	}
	public E obtenerCabeza() {
		return header.getData();
	}
	public E obtenerCola() {
		return cola.getData();
	}
	public int getLongitud() {
		return longitud;
	}
	public boolean eliminar (E inputData) {
		boolean borrado= false;
		if (header != null) {
			if (header==cola&& inputData.equals(header.getData())) {
				header=cola=null;
				borrado=true;
				longitud--;
			}else if (inputData.equals(header.getData())) {
				
			}
		}
	} 
}
