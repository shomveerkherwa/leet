package revision.trie;

import java.util.Arrays;
import java.util.List;

public class RemoveSubFoldersFromFileSystem {

	public static void main(String[] args) {
		String[]folder = {"/a","/a/b","/c/d","/c/d/e","/c/f"};
		List<String> result = removeSubfolders(folder);
		System.out.println(Arrays.toString(result.toArray()));
	}

	public static List<String> removeSubfolders(String[] folder) {
		FileSystemTrie tree = new FileSystemTrie();
        int l = folder.length;
        for(int i=0; i<l; i++){
            String[] str = folder[i].split("/");
            tree.insert(str);
        }
        tree.search();
        return tree.folders;
	}

}
