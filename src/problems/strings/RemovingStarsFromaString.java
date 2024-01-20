package problems.strings;

import java.util.Stack;

public class RemovingStarsFromaString {

	public static void main(String[] args) {
		//String s = "leet**cod*e";
		String s = "erase*****";
		System.out.println(s +" ---> "+removeStars(s));
	}

	public static String removeStars(String s) {
        char[] result = new char[s.length()];
        int i=0;
        char[] inp = s.toCharArray();
        for(char c : inp) {
        	if(i > 0 && c == '*')
        		i--;
        	else {
        		result[i]=c;
            	i++;
            }
        }
        return String.valueOf(result, 0, i);
    }
}
