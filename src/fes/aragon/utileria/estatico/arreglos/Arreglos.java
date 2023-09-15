package fes.aragon.utileria.estatico.arreglos;

import fes.aragon.utileria.estatico.exep.IndiceFueraDeRango;

/**
 * @author sebastian Mendoza Rosas
 */
public class Arreglos <E> {
	private int indice = 0;
	private Object[] l;
	public Arreglos(int numeroElementos) {
		this.l = new Object[numeroElementos];
	}
	
	/**
	 * Método que inserta un valor de tipo Integer en el arreglo previamente creado
	 * 
	 * @param x es el parámetro que se recibe para asignar un valor dentro de un arreglo
	 * @throws IndiceFueraDeRango exepción que pasa cuando se exede el indice
	 * 
	 */
	public void insertar(E x) throws IndiceFueraDeRango{
		if(indice < l.length) {
			l[indice] = x;
			indice++;
		} else {
			throw new IndiceFueraDeRango("Indice fuera de rango");
		}
	}
	
	/**
	 * Método que localizar un valor de tipo Integer en el arreglo previamente creado
	 * 
	 * @param x es el parámetro que se recibe para bucar un valor dentro de un arreglo
	 * @return se retoma -1 si no esta el valor de la lista, en caso contrario se retorna el indice
	 * 
	 */
	public Integer localizar(E x) {
		for(int i = 0; i < l.length; i++) {
			if(l[i] != null) {
				if(l[i].equals(x)) {
					//System.out.println(i);
					return i;
				}
			}
		}
		return -1;
	}
	
	/**
	 * Método que recupera un valor de tipo Integer de la posición indicada
	 * 
	 * @param p es el parámetro que se recibe para indicar la posición dentro de un arreglo
	 * @throws IndiceFueraDeRango exepción que pasa cuando la posición exede el indice o la posicion es menor a 0
	 * 
	 */
	public E recupera(int p) throws IndiceFueraDeRango{
		if(p > l.length || p < 0) {
			throw new IndiceFueraDeRango("Indice fuera de rango");
		} else {
			@SuppressWarnings("unchecked")
			final E e=(E)l[p];
			return e;
		}
	}
	
	/**
	 * Método que borra el valor de tipo Integer de la posición indicada
	 * 
	 * @param p es el parámetro que se recibe para indicar la posición dentro de un arreglo
	 * @throws IndiceFueraDeRango exepción que pasa cuando la posición exede el indice o la posicion es menor a 0
	 * 
	 */
	public void suprime(int p) throws IndiceFueraDeRango{
		if(p > l.length -1 || p < 0) {
			throw new IndiceFueraDeRango("Indice fuera de rango");
		} else {
			l[p] = null;
		}
	}
	
	/**
	 * Método que recupera el valor de tipo Integer de la posición siguiente, de la posicion previamente indicada
	 * 
	 * @param p es el parámetro que se recibe para indicar la posición dentro de un arreglo
	 * @throws IndiceFueraDeRango exepción que pasa cuando la posición es igual al indice o la posicion es menor a -1
	 * 
	 */
	public E siguiente(int p) throws IndiceFueraDeRango {
		if(p == l.length-1 || p <= -1) {
			throw new IndiceFueraDeRango("Indice fuera de rango");
		} else {
			@SuppressWarnings("unchecked")
			final E e=(E)l[p + 1];
			return e;
		}
	}
	
	/**
	 * Método que recupera el valor de tipo Integer de la posición anterior, de la posicion previamente indicada
	 * 
	 * @param p es el parámetro que se recibe para indicar la posición dentro de un arreglo
	 * @throws IndiceFueraDeRango exepción que pasa cuando la posición es igual al indice -1 o la posicion es menor a 1
	 * 
	 */
	public E anterior(int p) throws IndiceFueraDeRango {
		if(p > l.length - 1 || p <= 0) {
			throw new IndiceFueraDeRango("Indice fuera de rango");
		} else {
			@SuppressWarnings("unchecked")
			final E e=(E)l[p - 1];
			return e;
		}
	}
	
	/**
	 * Método que limpia el arreglo 
	 */
	public void limpiar() {
		for (int i = 0; i < l.length;i++) {
			l[i] = null;
		}
		l = new Object[l.length];
	}
	
	/**
	 * Método que recupera el primer valor de tipo Integer del arreglo
	 */
	public E primero() {
		@SuppressWarnings("unchecked")
		final E e=(E)l[0];
		return e;
	}
	
	/**
	 * Método que muestra que longitud tiene el arrglo
	 */
	public Integer longitud() {
		return l.length;
	}
	
	/**
	 * Método que imprime en pantalla todos los valores de tipo Integer del arreglo
	 */
	public void imprime() {
		for (int i = 0; i < l.length;i++) {
			System.out.print(l[i]+" ");
		}
		System.out.println();
	}
	
	/**
	 * Método que inserta un valor de tipo Integer en la posicion indicada de un arreglo
	 * 
	 * @param p es la posición del arreglo en donde quiero insetar el valor
	 * @param x es el parámetro que se recibe para asignar un valor dentro de un arreglo
	 * @throws IndiceFueraDeRango exepción que pasa cuando se exede el indice
	 * 
	 */
	public void asignar(int p, E x) throws IndiceFueraDeRango {
		if(p > l.length || p < 0) {
			throw new IndiceFueraDeRango("Indice fuera de rango");
		} else {
			l[p]=x;
		}
	}
}