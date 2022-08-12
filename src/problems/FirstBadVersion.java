package problems;

public class FirstBadVersion {

	//static int[] versions = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1};
	static int[] versions = {1, 1, 1};
	
	public static void main(String[] args) {
		int firstBadVersion = firstBadVersion(versions.length);
		System.out.println("firstBadVersion at "+firstBadVersion);
	}

	public static int firstBadVersion(int n) {
	    int start = 1, end = n;
	    while (start < end) {
	        int mid = start + (end-start) / 2;
	        if (!isBadVersion(mid)) {
	        	start = mid + 1;
	        }
	        else end = mid;            
	    }        
	    return start;
	}

	private static boolean isBadVersion(int mid) {
		return versions[mid] == 1;
	}
}
