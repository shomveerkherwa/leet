package revision.trie;

public class WordDictionaryTest {

	public static void main(String[] args) {
		WordDictionary wordDictionary = new WordDictionary();
		wordDictionary.addWord("bad");
		wordDictionary.addWord("dad");
		wordDictionary.addWord("mad");
		System.out.println(wordDictionary.search("pad")); // return False
		System.out.println(wordDictionary.search("bad")); // return True
		System.out.println(wordDictionary.search(".ad")); // return True
		System.out.println(wordDictionary.search("b..")); // return True
		
		System.out.println("-----------------");
		
		WordDictionaryTrieNode wordDictionary2 = new WordDictionaryTrieNode();
		wordDictionary2.insert("bad");
		wordDictionary2.insert("dad");
		wordDictionary2.insert("mad");
		System.out.println(wordDictionary2.search("pad")); // return False
		System.out.println(wordDictionary2.search("bad")); // return True
		System.out.println(wordDictionary2.search(".ad")); // return True
		System.out.println(wordDictionary2.search("b..")); // return True
	}

}
