package problems.strings;

public class FirstUniqueCharacters {

	public static void main(String[] args) {
		String inp = "mm";
		int uniqueIndex = getindexOfNonRepeatingChaacter(inp);
		System.out.println("inp "+inp +" "+uniqueIndex);

	}

	private static int getindexOfNonRepeatingChaacter(String inp) {
		int defautIndex = -1;
		
		if(inp == null || inp.length() == 0) {
			return defautIndex;
		}
		int size = inp.length();
		int i=0;
		int j=0;
		boolean charFOund = false;
		for (i = 0; i < size; i++) {
			for(j= 0; j < size; j++) {
				System.out.println("checking "+inp.charAt(i) +" with "+inp.charAt(j));
				if(inp.charAt(i) == inp.charAt(j) && i != j) {
					charFOund = false;
					break;
				} else {
					charFOund = true;
				}
			}
			
			if(j == size && charFOund)
				return i;
		}
		return defautIndex;
	}

}
