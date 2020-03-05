package edu.sussex.coms223.lab6;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * The class Stack implements a generic stack data structure which represents a
 * last-in first-out (LIFO) collection of objects.
 * 
 * The stack is implemented by extending the standard java.util.ArrayList data
 * structure (reuse via inheritance). Methods described in the textbook
 * interface that are implemented by ArrayList are not re-implemented in the
 * Stack subclass.
 * 
 * The stack uses an integer cursor, rather than an Interator, to implement
 * enumeration via first and next functions.
 * 
 * @param <T> the generic type of stack elements
 */
@SuppressWarnings("serial")
public class Stack<T> extends ArrayList<T> {
	private int cursor = -1;// done: declare a private integer member named "cursor" and initialize it to
	// -1

	/**
	 * Push the passed item of type T onto the stack. This is equivalent to calling
	 * the add function inherited from ArrayList.
	 *
	 * @param item the item to be pushed onto the stack.
	 */
	public void push(T item) {
		super.add( item);// Done 2: add the item passed as a parameter using the add function inherited
		// from the ArrayList super class. Hint: it is legal but unnecessary to use the
		// syntax "super." or "this." to call the add function.

	}

	/**
	 * Remove the last item added to the stack and return it. If the stack is empty,
	 * throw a NoSuchElementException.
	 *
	 * @return the last item added to (pushed onto) the stack.
	 * @throws NoSuchElementException if the stack is empty
	 */
	public T pop() {
		if(super.size()==0)
            throw new NoSuchElementException("Stack is empty");
         // Done 3: if the stack is empty, throw a NoSuchElementException.


		// Done 4: replace the "return null;" statement with code that removes the last
		// item added to the stack and returns that item to the caller. Hint: the first
		// item on the stack is at element 0 and the last is at element size() - 1.
        return super.remove(super.size()-1);
	}

	/**
	 * Set the cursor to the top of the stack and return the value. If the stack is
	 * empty return null.
	 *
	 * @return the item at the top of the stack or null if the stack is empty.
	 */
	public T first() {
		if(super.size()==0)// Done 5: add an if statement that checks if the stack is empty and if so
		 return null;// returns null.


		cursor=size()-1;// done 6: set the cursor to the index of the last item added (pushed) onto the
		// stack.

		// done7: replace the "return null;" statement with a statement that returns
		// the item at the index of the cursor.
		 return super.get(cursor);
	}

	/**
	 * Return the next item on the stack after decrementing the cursor. If the
	 * cursor is out of range (less than or equal to 0) return null.
	 *
	 * @return the next item on the stack or null if the cursor is <= 0
	 */
	public T next() {
		if(cursor<=0)// done 8: add an if statement that returns null if the cursor is <= 0
         return null;

		cursor=cursor--;// done 9: decrement the cursor and then use it to return the next item on the
		// stack replacing the "return null;" statement.
		return super.get(cursor);
	}
}
