package Herramintas;

import java.util.Random;
import java.util.Scanner;

import fes.aragon.utilerias.dinamicas.listasimple.ListaSimple;
import fes.aragon.utilerias.dinamicas.listasimple.ListaSimpleSinRepetir;

public class Herramientas {

	public static void main(String[] args) {
		//este es el programa V2 este es menos eficiente que el V1 pero este da mas feed-back
		/*7.-*Escribe un programa que elimine los elementos
 		repetidos de una lista simple, y los elementos
 		repetidos pasarlos a una lista nueva para desplegarlos.
 		Nota: Llenar la lista con números aleatorios
 		con un rango de [1,500],(1-600) para el tamaño*/
		System.out.println("Este programa omite las tildes de formar intencional");
		System.out.println("Nota la terminal de eclipse borra las primeras impreciones para poder aperciar todas la impreciones");
		System.out.println("se recomienda disminuir la logitud de la lista.\n");
		System.out.println("\n𝑰𝒏𝒈𝒓𝒆𝒔𝒂 𝒆𝒍 𝒏𝒖𝒆𝒓𝒐 𝒅𝒆 𝒆𝒍𝒎𝒆𝒏𝒕𝒐𝒔 𝒅𝒆 𝒍𝒂 𝒍𝒊𝒔𝒕𝒂 𝒐𝒓𝒊𝒈𝒊𝒏𝒂𝒍:");
		
		//Solicitar la logitud de la lista
		Scanner scanner = new Scanner(System.in);
		double inputLonger=1;
		// Leer el número ingresado por el usuario
		if (scanner.hasNextDouble()) {
        	inputLonger = scanner.nextDouble();
        } else {
            System.out.println("Entrada no válida. Debes ingresar un número válido.");
        }
        scanner.close();
		
		ListaSimpleSinRepetir<Integer> listaOriginal=new ListaSimpleSinRepetir<Integer>();
		ListaSimple<Integer> listaRepetidos=new ListaSimple<Integer>();
		Random numeberRandomGenerate= new Random();
		
		// Agrega los elemetos y de determina la loguitud de la lista
		for (int i=0; i<inputLonger; i++) {
			int numberRandom= numeberRandomGenerate.nextInt(501);
			//lista2.agregarEnCabeza(numberRandom);
			listaOriginal.agregarEnCola(numberRandom);
		}
		//esto se pone como medida de control para verificar el funcionamieto del programa
		listaOriginal.agregarEnCabeza(listaOriginal.obtenerCabeza());
		listaOriginal.agregarEnCabeza(listaOriginal.obtenerCabeza());
		listaOriginal.agregarEnCabeza(listaOriginal.obtenerCabeza());
		System.out.println("Lista antes de eliminar los datos eliminados");
		listaOriginal.imprimirElementos();
		System.out.println("----------------------------------------------");
		//Este metodo imprime la lista orginal y la lista de repetidos  con cada actualizacion
		listaOriginal.eliminaYPasarRepetidos(listaRepetidos);
	}
}
