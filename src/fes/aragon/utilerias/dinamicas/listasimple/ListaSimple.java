package fes.aragon.utilerias.dinamicas.listasimple;

import java.util.NoSuchElementException;

public class ListaSimple<E> {

	protected Nodo<E> header, cola;
	protected int longitud = 0;
	
	public ListaSimple() {
		header=cola=null;
	}
	
	public void agregarEnCabeza(E inputData) {
		header = new Nodo<E>(inputData, header);
		if (cola==null) {
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
				//header.setData((E)header.getNext());
				header=header.getNext();
				borrado=true;
				longitud--;
			}else {
				Nodo <E> temporal, predecesor;
				for(predecesor=header,temporal=header.getNext();temporal!=null && !temporal.getData().equals(inputData);predecesor.getNext(),temporal.getNext()) {
					if (temporal!= null) {
						borrado= true;
						longitud--;
						predecesor.setNext(temporal.getNext());
						if (temporal.equals(cola)) {
							cola=predecesor;
						}
					}	
				}
			}
		}
		return borrado;
	} 
	/**
	 * Este metodo elimina los elemetos de nuetra lista en dos posibles casos:
	 * 1- cuando la lista tiene mas de un elemento
	 * 2- cuando la lista tiene mas de un elemento
	 * */
	public void eliminarEnCabeza() {
		if (header !=null) {
			if (header.equals(cola)) {
				//cuando la lista tiene mas de un elemento
				header=cola=null;
				longitud--;
			}else {
				//cuando la lista tiene mas de un elemento
				header= header.getNext();
				longitud--;
			}
		}
	}
	@SuppressWarnings("unused")
	public void eliminarEnCola () {
		//probar porque creo que esta mal que esta mal
		if (header != null) {
			if (header == cola) {
				header= cola= null;
				longitud --;
			} else {
				Nodo<E> temporal;
				for (temporal=header; temporal.getNext()!=cola&&temporal.getNext()!=null;temporal=temporal.getNext()) {
					temporal.setNext(null);
					longitud--;
				}
			}
		}
	}
	
	// Estos metodos SON EXPERIMETALES
	@SuppressWarnings("unused")
	public E eliminarEnColaRetornaValor () {
		//probar porque creo que esta mal que esta mal
		if (header != null) {
			if (header == cola) {
				E valor = header.getData();
				valor= header.getData();
				header= cola= null;
				longitud --;
				return valor;
			} else {
				Nodo<E> temporal;
				E valor=null;
				for (temporal=header; temporal.getNext()!=cola&&temporal.getNext()!=null;temporal=temporal.getNext()) {
					valor = temporal.getData();
					temporal.setNext(null);
					longitud--;
				}
				return valor;
			}
		}else {
	        throw new NoSuchElementException("La lista está vacía. No se puede eliminar ningún valor.");
	    }
	}
	public E eliminarEnCabezaRetornaValor() {
		if (header !=null) {
			if (header.equals(cola)) {
				//cuando la lista tiene mas de un elemento
				E valor= header.getData();
				header=cola=null;
				longitud--;
				return valor;
			}else {
				//cuando la lista tiene mas de un elemento
				E valor= header.getData();
				header= header.getNext();
				longitud--;
				return valor;
			}
		}else {
	        throw new NoSuchElementException("La lista está vacía. No se puede eliminar ningún valor.");
	    }
	}
	
}