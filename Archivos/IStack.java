/**
 * 
 */
//package main;

/**
 * @author moises
 *
 */
public interface IStack<E> {
	
	public boolean push(E element);
	
	public E peek();
	
	public E pop();
	
	public int count();
	
	public boolean isEmpty();
}
