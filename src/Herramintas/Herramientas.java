package Herramintas;

import java.util.Random;
import fes.aragon.utilerias.dinamicas.listasimple.ListaSimple;
import fes.aragon.utilerias.dinamicas.listasimple.ListaSimpleSinRepetir;

public class Herramientas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Este programa omite las tildes de formar intencional");
		ListaSimpleSinRepetir<Integer> lista1=new ListaSimpleSinRepetir<Integer>();
		ListaSimple<Integer> lista2=new ListaSimple<Integer>();
		Random numeberRandomGenerate= new Random();
		
		for (int i=0; i<150; i++) {
			int numberRandom= numeberRandomGenerate.nextInt(1501);
			//lista2.agregarEnCabeza(numberRandom);
			lista1.agregarEnCola(numberRandom,lista2);
		}
		
		lista1.imprimirElementos();;
		System.out.println("--------------------------");
		System.out.println("Lista despues de agregar 6 numeros repetidos que son 152/n"
				+ "esto sirve como verificador del funcionamieto");
		lista1.agregarEnCabeza(152);
		lista1.agregarEnCabeza(152);
		lista1.agregarEnCabeza(152);
		lista1.agregarEnCabeza(152);
		lista1.agregarEnCabeza(152);
		lista1.agregarEnCabeza(152);
		lista1.imprimirElementos();
		System.out.println("Lista de elenetos eliminados de la lista original/n--------------------------/n--------------------------/n--------------------------/n--------------------------");
		lista2.imprimirElementos();
	}
}
