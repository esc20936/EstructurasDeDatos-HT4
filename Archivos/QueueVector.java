/**
 * 
 */
//package main;

import java.util.Vector;

/**
 * @author moises
 *
 */
public class QueueVector<E> extends Queue<E> {

	protected Vector<E> core;
	protected int head;
	protected int tail;
	
	public QueueVector(int size) {
		core = new Vector<E>(size);
		head = 0;
		tail = -1;
	}

	@Override
	public boolean add(E element) {
		if (this.count() < core.size()) {
			tail++;
			core.insertElementAt(element, tail);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public E peek() {
		return core.get(head);
	}

	@Override
	public E remove() {
		if (this.isEmpty()) {
			return null;
		} else {
			E temp = core.get(tail);
			tail--;
			return temp;
		}
	}

	@Override
	public int count() {
		return (tail + 1);
	}

	@Override
	public boolean isEmpty() {
		return (tail == -1);
	}

}
