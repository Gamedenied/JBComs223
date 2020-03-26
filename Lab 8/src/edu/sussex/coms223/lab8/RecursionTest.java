package edu.sussex.coms223.lab8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.sussex.coms223.lab8.Recursion.Node;

class RecursionTest {

	@Test
	void testFactorial() {
		assertEquals(1, Recursion.factorial(1));
		assertEquals(24, Recursion.factorial(4));
		assertThrows(IllegalArgumentException.class, () -> {
			Recursion.factorial(0);
		});
		assertThrows(IllegalArgumentException.class, () -> {
			Recursion.factorial(-1);
		});
	}

	@Test
	void testPalidrome() {
		assertTrue(Recursion.isPalindrome("abba"));
		assertTrue(Recursion.isPalindrome("madam"));
		assertFalse(Recursion.isPalindrome("abca"));
		assertTrue(Recursion.isPalindrome(""));
		assertTrue(Recursion.isPalindrome("a"));
		assertThrows(IllegalArgumentException.class, () -> {
			Recursion.isPalindrome(null);
		});
	}

	@Test
	void testInsert() {
		Node<Integer> head = new Node<>(0);
		head.next = new Node<>(1);
		Recursion.insert(head, new Node<>(2));
		assertEquals(2, head.next.next.value);
		assertNull(head.next.next.next);
		assertThrows(IllegalArgumentException.class, () -> {
			Recursion.insert(head, null);
		});
		assertThrows(IllegalArgumentException.class, () -> {
			Recursion.insert(null, new Node<>(0));
		});
	}

}
