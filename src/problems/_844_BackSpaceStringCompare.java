package problems;

public class _844_BackSpaceStringCompare {

	public static void main(String[] args) {
		//String one = "#ad#pq##klp###c";
		//String two = "ab#bb##c";
		
		String one = "a#c";
		String two = "dc";
		
		boolean result = checkEquality(one, two);
		System.out.println(result);
	}

	private static boolean checkEquality(String s, String t) {
		int s_pointer = s.length()-1;
		int t_pointer = t.length()-1;
		int s_skips = 0;
		int t_skips = 0;
		
		// bigger loop
		while( s_pointer >= 0  || t_pointer >= 0) {
			while( s_pointer >= 0) {
				char c = s.charAt(s_pointer);
				if(c == '#') {
					s_skips += 1;
					s_pointer -=1;
				} else if(s_skips != 0 ) {
					s_skips -=1;
					s_pointer -=1;
				} else {
					break;
				}
			}
			while( t_pointer >= 0) {
				char c = t.charAt(t_pointer);
				if(c == '#') {
					t_skips += 1;
					t_pointer -=1;
				} else if(t_skips != 0 ) {
					t_skips -=1;
					t_pointer -=1;
				} else {
					break;
				}
			}
			
			if(s_pointer >= 0 && t_pointer >= 0 && s.charAt(s_pointer) != t.charAt(t_pointer)) {
				return false;
			}
			
			if((s_pointer >= 0) != (t_pointer >= 0)) {
				return false;
			}
			
			s_pointer -=1;
			t_pointer -=1;
		}
		return true;
	}
}
