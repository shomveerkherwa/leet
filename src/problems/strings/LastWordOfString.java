package problems.strings;

public class LastWordOfString {

	public static void main(String[] args) {
		String inp = "   fly me   to   the moon  ";
		int output = lengthOfLastWord(inp);
		System.out.println(inp+ " ----> "+ output);		
	}

	public static  int lengthOfLastWord(String s) {
		int length = 0;
		int maxLength = s.length()-1;
    
    while(maxLength >= 0 && s.charAt(maxLength) == ' ') {
    	maxLength = maxLength - 1;
    }
    
    while(maxLength >= 0) {
    	if(s.charAt(maxLength) != ' ')
    		length++;
    	else
    		break;
    	maxLength--;
    }
    
    return length;
	}
}