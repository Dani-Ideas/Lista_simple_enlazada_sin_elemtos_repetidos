package Herramintas;
package fes.aragom.exep;
import java.lang.IndexOutOfBoundsException;



public class Arreglos<E> {
    private int indice = 0;
    private final Object[] array_to_manipulate;

    public Arreglos(int total_elements) {
        this.array_to_manipulate = new Object[total_elements];
    }

    public void insertar(E x) throws IndiceFueraDeRango {
        if (indice < array_to_manipulate.length) {
            array_to_manipulate[indice] = x;
            indice++;
        } else {
            throw new IndiceFueraDeRango("Índice fuera de rango");
        }
    }
    public int localiza(E x) {
    	for (int i =0; i<array_to_manipulate.length-1;i++) {
    		if (array_to_manipulate[i].equals(x)) {
    			return i;
    		}
    	}
    	return -1;
    }
    public E recupera (int position_array) throws IndiceFueraDeRango{
    	if (position_array >-1 && position_array<array_to_manipulate.length) {
    		@SuppressWarnings("unchecked")
    		final E data_from_position=(E)array_to_manipulate[position_array];
    		return data_from_position;
    		}else
    		throw new IndiceFueraDeRango("La posicion introducida dentro de la lista no es valida.");
    }
    public void suprime (int position_array) throws IndiceFueraDeRango{
    	if (position_array >-1 && position_array<array_to_manipulate.length) {
    		array_to_manipulate[position_array]=null;
    	}else {
    		throw new IndiceFueraDeRango("La posicion introducida dentro de la lista no es valida.");
    	}
    }
    public E siguiente (int position_array)throws IndiceFueraDeRango{
    	if (position_array >-1 && position_array<array_to_manipulate.length) {
    		@SuppressWarnings("unchecked")/// esta linea se pone por elcipse
    		final E data_from_position=(E)array_to_manipulate[position_array+1];
    		return data_from_position;
    	} else {
    		throw new IndiceFueraDeRango("La posicion introducida dentro de la lista no es valida.");
    	}
    }
    public E anterior (int position_array)throws IndiceFueraDeRango{
    	if (position_array >-1 && position_array<array_to_manipulate.length) {
    		@SuppressWarnings("unchecked")/// esta linea se pone por elcipse
    		final E data_from_position=(E)array_to_manipulate[position_array-1];
    		return data_from_position;
    	} else {
    		throw new IndiceFueraDeRango("La posicion introducida dentro de la lista no es valida.");
    	}
    }
    ////
    ////
    ////pedir ayuda
    ////
    ////
    ////
    public void limpiar () {
    	array_to_manipulate.finalize();/// por alguna razon no me deja usar el metodo de la clase padre Object
    }
    public E primero () throws IndiceFueraDeRango{
    	if (array_to_manipulate[0]!=null) {
    		@SuppressWarnings("unchecked")/// esta linea se pone por elcipse
    		final E data_from_position=(E)array_to_manipulate[0];
    		return data_from_position;
    	}else {
    		throw new IndiceFueraDeRango("La posicion introducida dentro de la lista no es valida.");
    	}
    }
    public void imprime() {
    	for (int i=0; i<array_to_manipulate.length;i++) {
    		System.out.println(array_to_manipulate[i]);
    	}
    }
    public void asignar (int position_array, E data_to_assign) {
    	//en este metodo tengo mis dudas, porque puede existir la posiblilidad de que el leguaje trate de meter un generic 
    	// que no coincida don el generic del arreglo
    }
}