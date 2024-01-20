package revision.trie.lexographicalnumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		Trie t =  new Trie();
		int n = 13;
		for(int i=1; i<=n;i++) {
			t.insert(i);
		}
		
		List<Integer> result = new ArrayList<Integer>();
		for(int i=0; i<10;i++) {
			t.get(result, i);
		}
		
		System.out.println(Arrays.toString(result.toArray()));

	}
	
	

}
