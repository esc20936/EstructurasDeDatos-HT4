/**
 * 
 */
//package main;

/**
 * @author moise
 *
 */
public class QueueDoubleLinkedList<E> extends Queue<E> {

	ListDoubleLinkedList<E> core;
	
	public QueueDoubleLinkedList() {
		core = new ListDoubleLinkedList<E>();
	}
	
	@Override
	public boolean add(E element) {
		return core.insert(element);
	}

	@Override
	public E peek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E remove() {
		return core.removeAtStart();
	}

	@Override
	public int count() {
		return core.count();
	}

	@Override
	public boolean isEmpty() {
		return core.isEmpty();
	}

}
