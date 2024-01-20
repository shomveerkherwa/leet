package revision.trie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileSystemTrie {

	public class TrieNode{
		Map<String,TrieNode> children;
		boolean isWord;
		
		
		public TrieNode() {
			children = new HashMap<String, TrieNode>();
			isWord = false;
		}
	}
	
	TrieNode root;
	List<String> folders;
	
	public FileSystemTrie() {
		root = new TrieNode();
		folders = new ArrayList<String>();
	}
	
	public void insert(String[] arr){
		// each arr is an array of folders splitted on '/'
        int l = arr.length;
        TrieNode node = root;
        for(int i=1; i<l; i++){
			// starting with i=1 because the first element due to the split operation on a string is "" since it starts with /
            if (!node.children.containsKey(arr[i])){
                node.children.put(arr[i], new TrieNode());
            }
            node = node.children.get(arr[i]);
        }
        node.isWord = true;
    }
	
	public void search(){
        dfs(root, "");
        return;
    }
    
    public void dfs(TrieNode node, String str){
        if (node.isWord){
			// break as soon as we find the first isWord==true
            folders.add(str);
            return;
        }
        for(String key: node.children.keySet()){
			// repeat for all children maintaining path encountered till now
            dfs(node.children.get(key), str+"/"+key);
        }
        return;
    }
}
