package problems.strings;

public class AddStrings {

	public static void main(String[] args) {
		String num1 = "99";
		String num2 = "1";
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(addStrings(num1,num2));

	}

	public static String addStrings(String num1, String num2) {
        int carry = 0;
        int i = num1.length()-1;
        int j= num2.length()-1;
        StringBuilder sb = new StringBuilder();
        while(i >= 0 || j >= 0 || carry != 0) {
        	int a = i < 0 ? 0 : num1.charAt(i) - '0';
        	int b = j < 0 ? 0 : num2.charAt(j) - '0';
        	int sum = a + b + carry;
        	carry = sum / 10;
        	sb.append(Integer.toString(sum%10));
        	i--;j--;
        }
        return sb.reverse().toString();
    }
}
