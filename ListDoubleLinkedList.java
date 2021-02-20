/**
 * 
 */
//package main;

/**
 * @author moise
 *
 */
public class ListDoubleLinkedList<E> extends List<E> {

	private NodeDouble<E> _start;
	private NodeDouble<E> _end;
	private int size;
	
	public ListDoubleLinkedList() {
		_start = null;
		_end = null;
		size = 0;
	}
	
	@Override
	public boolean insert(E element) {
		NodeDouble<E> newNode = new NodeDouble<E>(element);
		
		if (this.isEmpty()) {
			_start = newNode;
			_end = newNode;
			size++;
		} else {
			_end.next = newNode;
			newNode.prev = _end;
			_end = newNode;
			size++;
		}
		
		return true;
	}

	@Override
	public boolean insertAt(E element, int index) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insertAtStart(E element) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insertAtEnd(E element) {
		return this.insert(element);
	}

	@Override
	public E removeAt(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E removeAtStart() {
		if (isEmpty()) {
			return null;
		} else if (count() == 1) {
			NodeDouble<E> temp = this._start;
			this._start = null;
			this._end = null;
			size--;
			return temp.value;
		} else {
			NodeDouble<E> temp = this._start;
			this._start.next.prev = null;
			this._start = this._start.next;
			size--;
			return temp.value;
		}
		
	}

	@Override
	public E removeAtEnd() {
		if (this.count() == 0)
			return null;
		else if (this.count() == 1) {
			NodeDouble<E> temp = this._start;
			this._start = null;
			this._end = null;
			size--;
			return temp.value;
		} else {
			NodeDouble<E> temp = _end;
			_end.prev.next = null;
			_end = _end.prev;
			size--;
			return temp.value;
		}
	}

	@Override
	public int count() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return (size == 0);
	}

}
