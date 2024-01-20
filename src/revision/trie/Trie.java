package revision.trie;

class Trie {

    public class TrieNode {
        public boolean isEnd;
        public TrieNode[] next;

        public TrieNode() {
            isEnd = false;
            next = new TrieNode[26];
        }
    }

    TrieNode root;

    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode curr = root;
    	for(char c : word.toCharArray()) {
        	if(curr.next[c-'a'] == null) {
        		curr.next[c-'a'] = new TrieNode();
        	}
        	curr = curr.next[c-'a'];
        }
    	curr.isEnd=true;
    }
    
    public boolean search(String word) {
    	TrieNode curr = root;
    	for(char c : word.toCharArray()) {
        	if(curr.next[c-'a'] == null){
        		return false;
        	} else {
        		curr = curr.next[c-'a'];
        	}
        }
    	return curr.isEnd;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode curr = root;
		for (char c : prefix.toCharArray()) {
			if (curr.next[c - 'a'] == null) {
				return false;
			} else {
				curr = curr.next[c - 'a'];
			}
		}
		return true;
    }
}
