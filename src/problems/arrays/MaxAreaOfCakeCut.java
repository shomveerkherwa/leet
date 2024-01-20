package problems.arrays;

import java.util.Arrays;

public class MaxAreaOfCakeCut {

	public static void main(String[] args) {
		//int h = 5; int w = 4; int[] horizontalCuts = {1,2,4};int[] verticalCuts = {1,3};
		
		//int h = 5; int w = 4; int[] horizontalCuts = {3,1};int[] verticalCuts = {1};
		
		//int h = 5; int w = 4; int[] horizontalCuts = {3};int[] verticalCuts = {3};
		
		int h = 1000000000; int w = 1000000000; int[] horizontalCuts = {2};int[] verticalCuts = {2};
		
		System.out.println(maxArea(h,w,horizontalCuts,verticalCuts));
		System.out.println(maxAreaCopy(h,w,horizontalCuts,verticalCuts));
		
	}

	public static int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
		// modify horizontal
		int[] horizontal = new int[horizontalCuts.length + 2];
		horizontal[0] = 0;
		for(int i=0; i< horizontalCuts.length; i++)
			horizontal[i+1] = horizontalCuts[i];
		horizontal[horizontal.length - 1] = h;
		
		int[] vertical = new int[verticalCuts.length + 2];
		vertical[0] = 0;
		for(int i=0; i< verticalCuts.length; i++)
			vertical[i+1] = verticalCuts[i];
		vertical[vertical.length - 1] = w;
		
		Arrays.sort(horizontalCuts);
		Arrays.sort(verticalCuts);
		
		
		long maxHor = 1;
		for(int i=1; i< horizontal.length; i++)
			maxHor = Math.max(maxHor, horizontal[i]-horizontal[i-1]);
		
		long mod = 1000000007l;
		
		maxHor =  maxHor % mod;
		
		long maxVer = 1;
		for(int i=1; i< vertical.length; i++)
			maxVer = Math.max(maxVer, vertical[i]-vertical[i-1]);
		
		maxVer =  maxVer % mod;
		
		return (int) ((maxHor * maxVer) % mod);
	}
	
	 public static int maxAreaCopy(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
	        int maxH = 0;
	        int maxV = 0;
	        Arrays.sort(horizontalCuts);
	        Arrays.sort(verticalCuts);
	        for (int i = 0; i < horizontalCuts.length; i++) {
	            maxH = Math.max(maxH, i == 0 ? horizontalCuts[i] : horizontalCuts[i] - horizontalCuts[i - 1]);
	        }
	        maxH = Math.max(maxH, h - horizontalCuts[horizontalCuts.length - 1]);
	        for (int i = 0; i < verticalCuts.length; i++) {
	            maxV = Math.max(maxV, i == 0 ? verticalCuts[i] : verticalCuts[i] - verticalCuts[i - 1]);
	        }
	        maxV = Math.max(maxV, w - verticalCuts[verticalCuts.length - 1]);
	        return (int)(maxH % (1e9 + 7) * maxV % (1e9 + 7));
	    }
}
