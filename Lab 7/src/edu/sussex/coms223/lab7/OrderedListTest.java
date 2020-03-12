package edu.sussex.coms223.lab7;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.NoSuchElementException;

import org.junit.jupiter.api.Test;

/*-
 * The class OrderedListTest contains a set of JUnit tests that exercise class
 * OrderedList.
 * 
 * At the beginning of each test, create a local instance of an OrderedList
 * using Integer as the generic template type and the default constructor:
 * 
 *   OrderList<Integer> list = new OrderedList<>();
 *   
 * However, to get 100% code coverage of OrderedList.java, you must use the other
 * constructor in at least one test method:
 * 
 *   OrderList<Integer> list = new OrderedList<>(10);
 * 
 * The following assertion methods should be used to implement your tests:
 * 
 *   assertTrue(condition) 
 *   assertFalse(condition) 
 *   assertEquals(expected value, expression) 
 *   assertThrows(exception class, executable)
 *   assertNull(expression)
 * 
 * Below are some examples taken from the previous labs StackTest.java:
 * 
 *   assertEquals(0, s.size());
 *   assertNull(s.first()); 
 *   assertTrue(s.isEmpty());
 *   assertThrows(NoSuchElementException.class, () -> { s.pop(); });
 * 
 */

	

class OrderedListTest {
	
	@Test
	void testEmptySizeAndClear() {
		OrderedList<Integer> list = new OrderedList<>(10);
		
		 if(list.isEmpty());
		 list = new OrderedList<>(10);
		 
		}
	

	@Test
	public <T> void testAdd(int pos, T item) {
		OrderedList<Integer> list = new OrderedList<>(10);
		if (pos < 0 || pos>= list.size()) {
			throw new IndexOutOfBoundsException(
			"pos  , 0 or >= " + list.size()+1);
		}
		if (pos > 0) {
			if (item.equals((list.get(pos-1)) <=0)) {
				throw new OrderViolationException();
			}
		}
	 if (pos < list.size()-1) {
		 if (item.equals(list.get(pos-1) >= 0)) {
			 throw new OrderViolationException();
		 }
	 }
   list.add(pos);
	}

	@Test
	public <T> void testInsertGet(int pos, T item) {
		OrderedList<Integer> list = new OrderedList<>(10);
	
		if (list.size() == 0) {
			list.add(pos);
			return;
		}

		// find where the element should go
		int pos = binarySearch(T);

		if (pos >= 0) { // this is a duplicate entry
			throw new OrderViolationException();
		} else {
			list.add(-pos - 1,(T));
	}

	@Test
	void testRemove() {
		OrderedList<Integer> list = new OrderedList<>(10);
		list.insert(0);
		assertEquals(0, list.get(0));
		list.remove(0);
		assertTrue(list.isEmpty());
		list.insert(1);
		list.remove(Integer.valueOf(1));
		assertTrue(list.isEmpty());
		assertThrows(IndexOutOfBoundsException.class, () -> {
			list.remove(-1);
		});
		assertThrows(IndexOutOfBoundsException.class, () -> {
			list.remove(10);
		});
		assertThrows(NoSuchElementException.class, () -> {
			list.remove(Integer.valueOf(0));
		});
		list.insert(1);
		assertThrows(NoSuchElementException.class, () -> {
			list.remove(Integer.valueOf(0));
		});
	}

	@Test
	void testFirstNext(int pos) {
		OrderedList<Integer> list = new OrderedList<>(10);
		if (list.size()==0) {
			return;
		}
		 pos = 0;
		return list.get(pos)
		
	}
}
