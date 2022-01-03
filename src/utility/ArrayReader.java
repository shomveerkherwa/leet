package utility;

// Utility class to get a fixed number if a get on array is preformed out of range 
// used by #704
public class ArrayReader {

	private int[] array;
	
	public ArrayReader(int[] array) {
		this.array = array;
	}
	
	public int get(int index){
		return index < array.length ? array[index] : Integer.MAX_VALUE;
	}
}
