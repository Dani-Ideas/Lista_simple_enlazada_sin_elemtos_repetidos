package Herramintas;

import java.util.Random;

import fes.aragon.utilerias.dinamicas.listasimple.ListaSimpleSinRepetir;

public class Herramientas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Este programa omite las tildes de formar intencional");
		ListaSimpleSinRepetir<Integer> lista1=new ListaSimpleSinRepetir<Integer>();
		ListaSimpleSinRepetir<Integer> lista2=new ListaSimpleSinRepetir<Integer>();
		Random numeberRandomGenerate= new Random();
		
		for (int i=0; i<10; i++) {
			int numberRandom= numeberRandomGenerate.nextInt(1501);
			//lista2.agregarEnCabeza(numberRandom);
			lista1.agregarEnCola(numberRandom,lista2);
		}
		
		lista1.imprimirElemetos();
		System.out.println("--------------------------");
		lista1.agregarEnCola(152,lista2);
		lista1.agregarEnCola(152,lista2);
		System.out.println("Lista despues de agregar dos numeros repetidos que son 152");
		lista1.imprimirElemetos();
		System.out.println("Lista de elenetos eliminados de la lista original/n--------------------------/n--------------------------/n--------------------------/n--------------------------");
		lista2.imprimirElemetos();
	}
}
