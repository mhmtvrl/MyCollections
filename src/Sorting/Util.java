package Sorting;

import java.util.Comparator;

/**
 * Util class includes some helper functions for sorting, testing and debugging.
 * @author mehmet
 *
 */
public class Util {
	/****************************************************************
	 * Helper functions for testing and debugging.					*
	 ****************************************************************/
	
	public static boolean isSorted(Comparable<?>[] a) {
		return isSorted(a, 0, a.length - 1);
	}
	
	public static boolean isSorted(Comparable<?>[] a, int lo, int hi) {
		for(int i = lo + 1; i <= hi; i++) {
			if(less(a[i], a[i - 1]))
				return false;
		}
		return true;
	}
	
	/****************************************************************
	 * Helper functions for sorting.								*
	 ****************************************************************/
	
	/**
	 * is v < w ?
	 * @param v
	 * @param w
	 * @return
	 */
	public static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}
	
	public static boolean less(Object v, Object w, Comparator comparator) {
		return comparator.compare(v, w) < 0;
	}
}
