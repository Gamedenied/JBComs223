package edu.sussex.coms223.lab8;

public class Recursion {

	/**
	 * Compute the factorial of the integer parameter n. This is the product of n
	 * times each of its non-zero integer predecessors, i.e. n * (n-1) * (n-2) * ...
	 * 1.
	 *
	 * @param n the value to compute the factorial of
	 * @return the factorial of parameter n
	 */
	static public int factorial(int n) {
		// If n is non-positive, throw an exception
		if (n <= 0)
			throw new IllegalArgumentException("n must be a positive integer");

		// The base case of n equals 1: return 1 and terminate the recursion.
		if (n == 1)
			return 1;

		// If n is greater than 1, return n * the factorial of n - 1.
		int factn = n * factorial(n - 1);
		return factn;
	}

	/**
	 * Checks if a string is a palindrome. Per chapter 8, programming problem P8.9,
	 * a string of characters is defined as a palindrome if it reads the same both
	 * forwards and backwards. For example, the string "abba" and "madam" are
	 * palindromes. The empty string and a single-character string are considered to
	 * be palindromes.
	 *
	 * @param s the string to check if palindrome
	 * @throws IllegalArgumentException if null string passed
	 * @return true, if s is palindrome else false
	 */
	static public boolean isPalindrome(String s) {

		 int i = 0, j = s.length() - 1; // TODO 1: Implement this method! Completed!
		 
		 while (i < j) { 
			 
			 if (s.charAt(i) != s.charAt(j))  
			  return false;
			 
			 i++;
			 j--;
		 }
		return true;
	}

	/**
	 * The Node class is used in the linked list program problem below.
	 *
	 * @param <T> the generic type
	 */
	static class Node<T> {
		T value;
		Node<T> next;

		Node(T value) {
			this.value = value;
			next = null;
		}
	}

	/**
	 * Append newNode at the tail of the list L. See P8.5 in the textbook.
	 *
	 * @param <T>     the generic Node value type
	 * @param L       the head of the list to append
	 * @param newNode the new node
	 * @throws IllegalArgumentException if either L or newNode is null
	 */
	static public <T> void insert(Node<T> L, Node<T> newNode) {
     Node T = new Node(newNode);
	   if (L == null) {
		throw new IllegalArgumentException();
	   }
     else  {
    	 if (newNode == null)
    			throw new IllegalArgumentException();
     }
	   T.next=newNode;
	  
	     }
	}
	   
    	

	
