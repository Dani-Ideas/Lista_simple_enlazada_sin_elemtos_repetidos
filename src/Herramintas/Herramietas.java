package Herramintas;
import java.util.Random;
import fes.aragon.utilerias.dinamicas.listasimple.ListaSimple;

public class Herramietas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaSimple<Integer> lista1=new ListaSimple<>();
		Random numeberRandomGenerate= new Random();
		for (int i=0; i<10; i++) {
			lista1.agregarEnCola((Integer)numeberRandomGenerate.nextInt(50,120));
		}
	}

}
