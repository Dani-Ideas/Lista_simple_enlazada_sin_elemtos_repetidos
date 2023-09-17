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
		// Agrega los elemetos
		for (int i=0; i<150; i++) {
			int numberRandom= numeberRandomGenerate.nextInt(501);
			//lista2.agregarEnCabeza(numberRandom);
			lista1.agregarEnCola(numberRandom);
		}
		//esto se pone para verigicar el funcionamieto
		lista1.agregarEnCabeza(lista1.obtenerCabeza());
		lista1.agregarEnCabeza(lista1.obtenerCabeza());
		lista1.agregarEnCabeza(lista1.obtenerCabeza());
		lista1.agregarEnCabeza(lista1.obtenerCabeza());
		lista1.agregarEnCabeza(lista1.obtenerCabeza());
		lista1.agregarEnCabeza(lista1.obtenerCabeza());
		System.out.println("Lista antes de eliminar los datos eliminados");
		lista1.imprimirElementos();
		System.out.println("----------------------------------------------");
		lista1.eliminaYPasarRepetidos(lista2);
	}
}
