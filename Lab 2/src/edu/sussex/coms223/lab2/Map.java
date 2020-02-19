package edu.sussex.coms223.lab2;

/**
 * The Interface Map. Maintain a collection of values of generic type V that are
 * looked up (mapped) by keys of generic type K.
 * 
 * Constraints:
 * Neither a key nor value may be null.
 *
 * @param <K> the key type
 * @param <V> the value type
 */
public interface Map<K, V> {
	V put(K key, V value);

	V get(int i);

	V remove(K key);

	int size();

	void clear();

	V get(K key);
}
