package whatdoesitdo;

public class AndWithMinus {

	public static void main(String[] args) {
		int a = 24;
		int b = -24;
		
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(b));
		
		int c = a & -a;
		System.out.println(c);

	}

}
