/**
 * 
 */
//package main;

import java.util.LinkedList;

/**
 * @author moise
 *
 */
public class StackList<E> extends Stack<E> {

	protected LinkedList<E> core;
	
	public StackList() {
		core = new LinkedList<E>();
	}
	
	@Override
	public boolean push(E element) {
		return core.add(element);
	}

	@Override
	public E peek() {
		return core.get(core.size() - 1);
	}

	@Override
	public E pop() {
		return core.removeLast();
	}

	@Override
	public int count() {
		return core.size();
	}

	@Override
	public boolean isEmpty() {
		return core.isEmpty();
	}
	

}
