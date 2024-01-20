package revision.graph;

public class CenterOfGraphAgain {

	public static void main(String[] args) {
		int[][] edges = new int[][] {{1,2},{2,3},{4,2}};
		System.out.println("center is "+ findCenter(edges));
		System.out.println("center is "+ findCenterConcise(edges));
	}
	
	public static int findCenter(int[][] edges) {
		int[]edge1 = edges[0];
		int[] edge2 = edges[1];
		
		if(edge1[0] == edge2[0])
			return edge1[0];
		if(edge1[0] == edge2[1])
			return edge1[0];
		return edge1[1];
	}
	
	public static int findCenterConcise(int[][] edges) {
		int x = edges[0][0];
		int y = edges[0][1];
		return (x == edges[1][0] || x == edges[1][1]) ? x :y; 
	}

}
