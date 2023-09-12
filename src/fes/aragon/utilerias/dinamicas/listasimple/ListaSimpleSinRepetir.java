package fes.aragon.utilerias.dinamicas.listasimple;

public class ListaSimpleSinRepetir<E> extends ListaSimple<E>{

	public void agregarEnCabeza(E inputData) {
		boolean es_Duplicado= super.eliminar(inputData); 
		if (!es_Duplicado) 
			super.agregarEnCabeza(inputData);
	}
	public void agregarEnCola(E inputData) {
		boolean es_Duplicado= super.eliminar(inputData); 
		if (!es_Duplicado)
			super.agregarEnCola(inputData);
	}
}
