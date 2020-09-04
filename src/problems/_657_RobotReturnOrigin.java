package problems;

public class _657_RobotReturnOrigin {

	public static void main(String[] args) {
		String input = "LRUD";
		boolean atOrigin = judge(input);
		System.out.println("Is at origin: "+atOrigin);
	}

	private static boolean judge(String input) {
		int x = 0;
		int y = 0;
		
		for(char inpc : input.toCharArray()) {
			switch(inpc) {
			case 'L': 
				x -=1;
				break;
			case 'R': 
				x +=1;
				break;
			case 'U': 
				y +=1;
				break;
			case 'D': 
				y -=1;
				break;
			default:
				return false;
			}
		}
		System.out.println("x: "+x);
		System.out.println("y: "+y);
		if(x == 0 && y == 0) {
			return true;
		}
		return false;
	}

}
