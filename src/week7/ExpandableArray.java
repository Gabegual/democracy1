package week7;

import acm.program.ConsoleProgram;

/* this class provides methods for working with an array that expends
 * to include any positive index values supplied by the caller.*/
public class ExpandableArray extends ConsoleProgram {
	Object[] array;
	/* Creates a new expandable array with no elements */
	public ExpandableArray() {
		 this.array = new Object[0];
	}
	/* sets the element at the given index position to the specified
	 * value. If the internal array is not large enough to contain that
	 * element, the implementation expands the array to make room*/
	public void set(int index, Object value) {
		if(index > this.array.length) {
			this.array = expand(this.array, index + 1);
		}
		this.array[index] = value;
	}
	/* Returns the element at the specified index position, or null if
	 * no such element exists. Note that this method never throws an
	 * out-of-bounds exception. if the index outside the bounds of the array, the return 
	 * value is simply null*/
	public Object get(int index) {
		if((index > this.array.length) || (this.array[index] == null)) {
			return null;
		}
		return this.array[index];
	}
	
	public Object[] expand(Object[] oldArray, int bigSize) {
		Object[] biggerArray = new Object[bigSize];
		for(int i = 0; i< oldArray.length; i++) {
			biggerArray[i] = oldArray[i];
		}
		return biggerArray;
	}
	
}
