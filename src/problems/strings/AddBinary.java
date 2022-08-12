package problems.strings;

public class AddBinary {
	static boolean carry = false;
	
	public static void main(String[] args) {
		String a = "1010";
		String b = "1011";
		System.out.println(a);
		System.out.println(b);
		String result = addBinary(a,b);
		System.out.println(result);
	}
	
	public static String addBinary(String a, String b) {
		
		int maxA = a.length()-1;
		int maxB = b.length()-1;
		
		StringBuilder result = new StringBuilder();
		while(maxA >= 0 && maxB >= 0) {
			result.append(add(a.charAt(maxA), b.charAt(maxB)));
			maxA--; maxB--;
		}
		
		while(maxA >= 0) {
			result.append(add(a.charAt(maxA), '0'));
			maxA--;
		}
		
		while(maxB >= 0) {
			result.append(add('0' , b.charAt(maxB)));
			maxB--;
		}
		
		if(carry) {
			result.append("1");
		}
		
		return rev(result.toString());
	}

	private static String rev(String string) {
		int len = string.length()-1;
		StringBuilder result = new StringBuilder();
		while(len >= 0) {
			result.append(string.charAt(len));
			len--;
		}
		return result.toString();
	}

	private static String add(char a, char b) {
		if((a == '1' && b == '1') && carry) {
			carry = true;
			return "1";
		} else if((a == '1' && b == '1') && !carry ) {
			carry = true;
			return "0";
		} else if ((a == '1' || b == '1') && carry) {
			carry = true;
			return "0";
		} else if ((a == '1' || b == '1') && !carry) {
			return "1";
		} else if ((a == '0' || b == '0') && carry) {
			carry = false;
			return "1";
		} 
		return "0";
	}
	
	
}
