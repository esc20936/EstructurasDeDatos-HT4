/**
 * 
 */
//package main;

/**
 * @author moises
 *
 */
public interface IQueue<E> {
	
	//Add an element in the queue tail, boolean if it is possible add item into the core structure
	public boolean add(E element);
	
	//retrieves the head element but doesnt remove it
	public E peek();
	
	//retrieves and remove the head element.
	public E remove();
	
	//return the quantity of elements
	public int count();
	
	//returns true if is empty, false otherwise
	public boolean isEmpty();
	
}
