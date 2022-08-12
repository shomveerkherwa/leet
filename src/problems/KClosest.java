package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class KClosest {

	public static void main(String[] args) {
		int[][] points = {{-5,4},{-6,-5},{4,6}};
		int k = 2;
		int[][] closePoints = kClosest(points, k);
		for(int[] inp: closePoints) {
			System.out.println(Arrays.toString(inp));
		}
	}
	
	public static int[][] kClosest(int[][] points, int k) {
		Map<Integer, List<Integer>> sortedTree = new TreeMap<>();
        
        for(int i = 0; i<points.length; i++) {
        	int x = points[i][0];
        	int y = points[i][1];
        	int distance = (int) Math.sqrt(Math.pow(x-0, 2) + (Math.pow(y-0 , 2))); 
        	System.out.println("Distance of "+Arrays.toString(points[i])+" is "+distance);
			if (sortedTree.containsKey(distance)) {
				sortedTree.get(distance).add(i);
			} else {
				List<Integer> indexes = new ArrayList<Integer>();
				indexes.add(i);
				sortedTree.put(distance, indexes);
			}
        }
        int[][] result = new int[k][2];
        int i = 0;
        for(List<Integer> vals : sortedTree.values()) {
        	for(Integer index : vals) {
        		if(k > 0) {
        			result[i++] = points[index];
        			k--;
        		} else
        			break;
        	}
        }
        return result;
    }
}
