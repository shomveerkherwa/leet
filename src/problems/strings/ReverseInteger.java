package problems.strings;

public class ReverseInteger {

	public static void main(String[] args) {
		int numb = 123;
		int reverse = reverse(numb);
		System.out.println(numb+" ---> "+reverse);
	}

	private static int reverse(int inp) {
		int newNumber = 0;
		int temp = 0;
		int tail = 0;
		int difference = 0;
		int numb = Math.abs(inp);
		while (numb > 0) {
			tail = numb % 10;
			temp = temp * 10 + tail;
			difference = (temp - tail)/10;
			if(difference != newNumber) {
				return 0;
			}
			newNumber = temp;
			numb = numb / 10;
		}
		newNumber = (inp < 0) ? -newNumber : newNumber;
		return newNumber;
	}

}
