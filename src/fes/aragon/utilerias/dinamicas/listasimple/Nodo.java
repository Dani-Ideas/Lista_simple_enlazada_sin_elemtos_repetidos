package fes.aragon.utilerias.dinamicas.listasimple;

public class Nodo<E> {
	private E data;
	private Nodo<E> next;
	public Nodo(E intput_data) {
		this(intput_data,null);////SPk01
	}
	public Nodo (E intput_data,Nodo<E> input_next) {
		this.data=intput_data;
		this.next= input_next;
	}
	public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public Nodo<E> getNext() {
        return next;
    }

    public void setNext(Nodo<E> next) {
        this.next = next;
    }
}
