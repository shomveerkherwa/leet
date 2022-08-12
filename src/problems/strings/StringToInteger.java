package problems.strings;

public class StringToInteger {

	public static void main(String[] args) {
		String input = "-41";
		// String input = "-2947483647";
		int output = getInteger(input);
		System.out.println(input+" -----> "+output);
	}

	private static int getInteger(String input) {
		char[] inp = input.toCharArray();
		int isNegative = 1;
		int returnValue = 0;
		int i = 0;
		while(i < inp.length && inp[i] == ' '){
				i++;
		}
		if(i < inp.length && (inp[i] == '-' || inp[i] == '+')) {
			isNegative = (inp[i++] == '-') ? -1 : 1 ;
		}
		
		while(i < inp.length) {
			char cur = inp[i++];
			int curValue = cur - '0';
			if(curValue < 0 || curValue > 9) {
				break;
			}
			//check edge case
			if(returnValue > Integer.MAX_VALUE / 10 || (returnValue == Integer.MAX_VALUE / 10 && curValue > 7 )){
				return isNegative == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE; 
			}
			returnValue = 10 * returnValue + curValue;
		}
		return isNegative * returnValue;
	}
}
