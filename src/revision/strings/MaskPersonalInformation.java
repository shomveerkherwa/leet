package revision.strings;

public class MaskPersonalInformation {

	public static void main(String[] args) {
		//String s = "LeetCode@LeetCode.com";
		String s = "1(234)567-890";
		System.out.println(s +"   ->  "+maskPII(s));
	}
	
	public static String maskPII(String s) {
		String[] country = {"", "+*-", "+**-", "+***-"};
		int at = s.indexOf("@");
		if( at > 0) {
			s = s.toLowerCase();
			return s.charAt(0)+"*****"+s.substring(at-1);
		}
		s = s.replaceAll("[^0-9]", "");
		return country[s.length()-10]+"***-***-"+s.substring(s.length()-4);
	}

}
