/**
 * 
 */
//package main;

/**
 * @author moise
 *
 */
public class NodeDouble<E> {
	public E value;
	public NodeDouble<E> next;
	public NodeDouble<E> prev;
	
	public NodeDouble(E element) {
		next = null;
		prev = null;
		value = element;
	}
}
