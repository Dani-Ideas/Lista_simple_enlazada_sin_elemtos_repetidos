package fes.aragon.utilerias.dinamicas.listasimple;

public class ListaSimpleSinRepetir<E> extends ListaSimple<E>{
	
	public void agregarEnCabeza(E inputData,ListaSimpleSinRepetir<E> listErrace) {
		boolean es_Duplicado= super.eliminar(inputData); 
		if (!es_Duplicado) 
			super.agregarEnCabeza(inputData);
		else {
			listErrace.agregarEnCabeza(inputData);
			super.agregarEnCabeza(inputData);
			}
	}
	public void agregarEnCabeza(E inputData) {
		super.agregarEnCabeza(inputData);
	}
	public void agregarEnCola(E inputData,ListaSimpleSinRepetir<E> listErrace) {
		boolean es_Duplicado= super.eliminar(inputData); 
		if (!es_Duplicado)
			super.agregarEnCola(inputData);
		else {
			listErrace.agregarEnCola(inputData);
			super.agregarEnCola(inputData);
			}
	}
	public void agregarEnCola(E inputData) {
		super.agregarEnCola(inputData);
	}
}
