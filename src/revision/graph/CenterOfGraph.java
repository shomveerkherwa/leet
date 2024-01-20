package revision.graph;

public class CenterOfGraph {

	public static void main(String[] args) {
		int[][] edges = {{1,2},{2,3},{4,2}};
		System.out.println(findCenter(edges));
	}
	
	public static int findCenter(int[][] edges) {
		if(edges == null) {
			return -1;
		}
		// calculate how many elements are present in the graph
		int size = edges.length+1;
		// array to mantian the occurances of that element in the edge
		int[] countFreq = new int[size+1];
		for(int i=0; i<edges.length;i++) {
			for(int j=0; j<2;j++) {
				countFreq[edges[i][j]]++;
			}
		}
		int center = 0;
		for(int i=1; i<=size;i++) {
			if(countFreq[i] == size-1) {
				center=i;
				break;
			}
		}
		return center;
	}

}
