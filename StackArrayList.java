/**
 * @author Moises Alonso
 * @version 1.0.0
 * 
 */
//package main;
//Importamos los modulos 
import java.util.ArrayList;

public class StackArrayList<E>  extends Stack<E>
{
    // ArrayList con el que guardaremos los datos
	protected ArrayList<E> data;

	public StackArrayList()
	// post: constructs a new, empty stack
	{
		data = new ArrayList<E>();
	}

	public boolean push(E item)
	// post: the value is added to the stack
	//          will be popped next if no intervening push
	{
		data.add(item);
        return true;
	}

	public E pop()
	// pre: stack is not empty
	// post: most recently pushed item is removed and returned
	{
		return data.remove(count()-1);
	}

	public E peek()
	// pre: stack is not empty
	// post: top value (next to be popped) is returned
	{
		return data.get(count() - 1);
	}
	
	public int count()
	// post: returns the number of elements in the stack
	{
		return data.size();
	}
  
	public boolean isEmpty()
	// post: returns true if and only if the stack is empty
	{
		return count() == 0;
	}
}   