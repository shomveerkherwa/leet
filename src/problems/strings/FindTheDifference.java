package problems.strings;

public class FindTheDifference {

	public static void main(String[] args) {
		String s ="abcd";
		String t = "abcde";
		System.out.println("Difference in "+s+" and "+t+" is "+findTheDifference(s, t));
	}

	public static char findTheDifference(String s, String t) {
        
		int[] frequency = new int[128];
		
		for(char c : s.toCharArray())
			frequency[c]++;
		
		for(char c : t.toCharArray())
			frequency[c]++;
		
		for(int i=0; i<frequency.length; i++)
			if(frequency[i] == 1) {
				return (char) i;
			}
		
		return ' ';
    }
}
