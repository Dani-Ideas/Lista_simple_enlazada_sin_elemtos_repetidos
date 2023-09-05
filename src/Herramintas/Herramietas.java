package Herramintas;
import java.util.Random;
import fes.aragon.utilerias.dinamicas.listasimple.ListaSimple;

public class Herramietas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaSimple<Integer> lista1=new ListaSimple<>();
		ListaSimple<Integer> lista2=new ListaSimple<>();
		Random numeberRandomGenerate= new Random();
		for (int i=0; i<100; i++) {
			int numberRandom= numeberRandomGenerate.nextInt(50,121);
			lista2.agregarEnCabeza(numberRandom);
			lista1.agregarEnCola(numberRandom);
		}
		lista1.imprimirElemetos();
		System.out.println("--------------------------");
		lista2.imprimirElemetos();
	}

}
