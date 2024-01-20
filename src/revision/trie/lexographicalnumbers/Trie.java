package revision.trie.lexographicalnumbers;

import java.util.List;

public class Trie {
	TrieNode root;
	
	public class TrieNode {
		boolean isEnd;
		TrieNode[] next;
		
		public TrieNode() {
			isEnd = false;
			next = new TrieNode[10];
		}
	}
	
	public Trie() {
		root = new TrieNode();
	}
	
	public void insert(int num) {
		TrieNode node = root;
		String s = num+"";
		for(int i=0; i<s.length();i++) {
			int digit = Character.getNumericValue(s.charAt(i));
			if(node.next[digit] == null) {
				node.next[digit] = new TrieNode();
			}
			node = node.next[digit];
		}
		node.isEnd=true;
	}
	
	public void get(List<Integer> result, int n) {
		TrieNode node = root;
		if(root.next[n] != null) {
			getMoreNumbers(result, node.next[n], n);
		}
	}

	private void getMoreNumbers(List<Integer> result, TrieNode node, int n) {
		if(node.isEnd) {
			result.add(n);
		}
		for(int i=0;i<10;i++) {
			if(node.next[i] != null) {
				getMoreNumbers(result, node.next[i], n * 10 + i);
			}
		}
	}
}
