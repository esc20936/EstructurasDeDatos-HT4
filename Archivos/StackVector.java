/**
 * 
 */

import java.util.Vector;

/**
 * @author moise
 *
 */
public class StackVector<E> extends Stack<E> {

	protected Vector<E> core;
	protected int tail;
	protected int sizeVector;
	public StackVector(int size) {
		core = new Vector<E>(size);
		tail = 0;
		sizeVector = size;
	}
	
	@Override
	public boolean push(E element) {
		if (this.count() < sizeVector) {
			
			core.insertElementAt(element, tail++);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public E peek() {
		return core.get(tail-1);
	}

	@Override
	public E pop() {
		if (this.isEmpty()) {
			return null;
		} else {
			E temp = core.get(--tail);
			return temp;
		}
	}

	@Override
	public int count() {
		return (tail);
	}

	@Override
	public boolean isEmpty() {
		return (tail == 0);
	}

}
