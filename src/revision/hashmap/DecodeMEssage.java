package revision.hashmap;

import java.util.HashMap;
import java.util.Map;

public class DecodeMEssage {

	public static void main(String[] args) {
		String key = "the quick brown fox jumps over the lazy dog"; String message = "vkbs bs t suepuv";
		System.out.println(decodeMessage(key, message));
	}

	public static String decodeMessage(String key, String message) {
		StringBuilder sb = new StringBuilder();
		
		Map<Character,Character> keyMap = new HashMap<Character,Character>();
		
		char start = 'a';
		for(char c : key.toCharArray()) {
			 if(c != ' ' && !keyMap.containsKey(c)) {
				 keyMap.put(c, start++);
			}
		}
		
		for(char c : message.toCharArray()) {
			if(keyMap.containsKey(c)) {
				sb.append(keyMap.get(c));
			} else {
				sb.append(c);
			}
		}
		return sb.toString();
	}
	
	public String decodeMessageAgain(String key, String message) {
        Map<Character, Character> map = new HashMap<>();
        int a = 97;
        for(char c : key.toCharArray()){
            if(c == ' '){
                continue;
            }
            else{
                if(!map.containsKey(c)){
                    map.put(c, (char)a);
                    a++;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c1 : message.toCharArray()){
            if(c1 != ' '){
                sb.append(map.get(c1));
            }
            else{
                sb.append(" ");
            }
        }
        return sb.toString();
    }

}
