/**
 * 
 */
//package main;

/**
 * @author moise
 *
 */
public interface IList<E> {

	public boolean insert(E element);
	
	public boolean insertAt(E element, int index);
	
	public boolean insertAtStart(E element);
	
	public boolean insertAtEnd(E element);
	
	public E removeAt(int index);
	
	public E removeAtStart();
	
	public E removeAtEnd();
	
	public int count();
	
	public boolean isEmpty();
}
