package fes.aragon.utilerias.dinamicas.listasimple;

public class ListaSimpleSinRepetir<E> extends ListaSimple<E>{
	
	public void agregarEnCabeza(E inputData,ListaSimpleSinRepetir<E> listErrace) {
		boolean es_Duplicado= super.eliminar(inputData); 
		if (!es_Duplicado) 
			super.agregarEnCabeza(inputData);
		else 
			listErrace.agregarEnCola(inputData);
	}
	public void agregarEnCola(E inputData,ListaSimpleSinRepetir<E> listErrace) {
		boolean es_Duplicado= super.eliminar(inputData); 
		if (!es_Duplicado)
			super.agregarEnCola(inputData);
		else 
			listErrace.agregarEnCola(inputData);
	}
}
