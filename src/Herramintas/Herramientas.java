package Herramintas;

import java.util.Random;

import fes.aragon.utilerias.dinamicas.listasimple.ListaSimpleSinRepetir;

public class Herramientas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		lista1.imprimirElemetos();
	}
}
