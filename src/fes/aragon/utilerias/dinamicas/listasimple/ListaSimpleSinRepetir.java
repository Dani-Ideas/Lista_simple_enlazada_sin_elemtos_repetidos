package fes.aragon.utilerias.dinamicas.listasimple;

public class ListaSimpleSinRepetir<E> extends ListaSimple<E>{
	
	public boolean contiene(E elemento) {
	    Nodo<E> temporal = header;
	    while (temporal != null) {
	        if (temporal.getData().equals(elemento)) {
	            return true; // El elemento está en la lista
	        }
	        temporal = temporal.getNext();
	    }
	    return false; // El elemento no está en la lista
	}
	public void agregarEnCabeza(E inputData, ListaSimple<E> list_errace) {
        if (!contiene(inputData)) {
            super.agregarEnCabeza(inputData);
        } else {
            list_errace.agregarEnCabeza(inputData);
        }
    }
    
    public void agregarEnCola(E inputData, ListaSimple<E> list_errace) {
        if (!contiene(inputData)) {
            super.agregarEnCola(inputData);
        } else {
            list_errace.agregarEnCola(inputData);
        }
    }
    public void agregarEnCabeza(E inputData) {
        if (!contiene(inputData)) 
            super.agregarEnCabeza(inputData);
	}
	public void agregarEnCola(E inputData) {
        if (!contiene(inputData))
            super.agregarEnCola(inputData);
	}
}
