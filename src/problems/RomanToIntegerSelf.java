package problems;

public class RomanToIntegerSelf {

	public static void main(String[] args) {
		String input = "XXX";
		int num = getIntFromRoman(input);
		System.out.println(input+" ---> "+num);

	}
	
	private static int getIntFromRoman(String inp ) {
		int result = 0;
		char[] charInp = inp.toCharArray();
		int i = charInp.length-1;
		while(i >= 0) {
			char ch = charInp[i--];
			switch(ch) {
			case 'I':
				result = result + 1 * ( (result >= 5) ? -1 : 1);
				break;
			case 'V':
				result = result + 5;
				break;
			case 'X':
				result = result + 10 *(result >= 50 ? -1 : 1);
				break;
			case 'L':
				result = result + 50;
				break;
			case 'C':
				result = result + 100 *(result >= 500 ? -1 : 1);
				break;
			case 'D':
				result = result + 500;
				break;
			case 'M':
				result = result + 1000;
				break;
			}
		}
		return result;
	}
}
