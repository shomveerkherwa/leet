package revision.trie;

public class WordDictionaryTrieNode {
	
        public boolean isEnd;
        public WordDictionaryTrieNode[] next;

        public WordDictionaryTrieNode() {
            isEnd = false;
            next = new WordDictionaryTrieNode[26];
        }
    
    public void insert(String word) {
    	WordDictionaryTrieNode curr = this;
    	for(char c : word.toCharArray()) {
        	if(curr.next[c-'a'] == null) {
        		curr.next[c-'a'] = new WordDictionaryTrieNode();
        	}
        	curr = curr.next[c-'a'];
        }
    	curr.isEnd=true;
    }
    
    public boolean search(String word) {
    	WordDictionaryTrieNode curr = this;
    	for(int i=0; i<word.length();i++) {
    		char c = word.charAt(i);
    		if(c == '.') {
    			for(WordDictionaryTrieNode subRoot : curr.next) {
    				if(subRoot != null && subRoot.search(word.substring(i+1)))
    					return true;
    			}
    			return false;
    		}
        	if(curr.next[c-'a'] == null){
        		return false;
        	} else {
        		curr = curr.next[c-'a'];
        	}
        }
    	return curr.isEnd;
    }    
}
