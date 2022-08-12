package problems;

public class CubeRoot {

	public static void main(String[] args) {
		int n = 17;
		int cube = findCube(n);
		//int cube = floorSqrt(n);
		System.out.println("Cube of "+n+" is "+cube);
	}

	private static int findCube(int n) {
		return binarySearch(1, n, n);
	}

	private static int binarySearch(int start, int end, int key) {
		int mid = (start+end)/2;
		int square = mid * mid;
		
		if(start > end)
			return mid;
		
		if(square == key)
			return mid;
		else if(square < key) {
			return binarySearch(mid+1, end, key);
		}else {
			return binarySearch (start, mid-1, key);
		}
	}
	
	public static int floorSqrt(int x)
    {
        // Base Cases
        if (x == 0 || x == 1)
            return x;
 
 
        // Do Binary Search for floor(sqrt(x))
        long start = 1, end = x, ans=0;
        while (start <= end)
        {
            int mid = (int) ((start + end) / 2);
 
            // If x is a perfect square
            if (mid*mid == x)
                return (int)mid;
 
            // Since we need floor, we update answer when mid*mid is
            // smaller than x, and move closer to sqrt(x)
            if (mid*mid < x)
            {
                start = mid + 1;
                ans = mid;
            }
            else   // If mid*mid is greater than x
                end = mid-1;
        }
        return (int)ans;
    }
}
