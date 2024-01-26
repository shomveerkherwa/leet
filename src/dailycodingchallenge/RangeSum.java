package dailycodingchallenge;


/*
 * 
 * You are given an array of length 24, where each element represents the number of new subscribers during the corresponding hour.
 * Implement a data structure that efficiently supports the following:

update(hour: int, value: int): Increment the element at index hour by value.
query(start: int, end: int): Retrieve the number of subscribers that have signed up
 between start and end (inclusive).
 * 
 * */
public class RangeSum {

	// CONCEPTS OF FENWICK TREES IS USED HERE
	
	// https://www.youtube.com/watch?v=DPiY9wFxGIw
	
	// Few things to consider before looking at logic
	// 1. if a number is 'x' and if you need to know the rightmost set bit, use the below formula
	//    x - (x & -x)
	// 2. to find, what are the other numbers that will store the sum of current index, keep adding 1 bit
	//    x + (x & -x)
	
	// max capacity
	private static final int N = 100010;
    // auxillary array that will store the range sums
	private static int[] bit = new int[N];
	
	// update the number at given index
	public static void update(int i, int value) {
        for (; i < N; i = i + (i & -i))
            bit[i] += value;
    }
	
	public static int sum(int i) {
        int ans = 0;
        for (; i > 0; i = i - (i & -i))
            ans += bit[i];
        return ans;
    }
	
	// query(start: int, end: int)
	public static int sum(int startIndex, int endIndex) {
		// startIndex till endIndex = endIndex - (startIndex -1)
		return sum(endIndex) - sum(startIndex - 1);
	}
	
	public static void main(String[] args) {
		
	}

}
