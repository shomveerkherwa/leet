package problems;

public class CommonPrefix {

	public static void main(String[] args) {
		String[] strs = {"flower","flow","flight"};
		String prefix = commonPrefix(strs);
		System.out.println("Common prefix among ");
		for(String str : strs) {
			System.out.print(str+ "\t");
		}
		System.out.println(prefix);
	}

	private static String commonPrefix(String[] strs) {
		if(strs == null || strs.length == 0)
			return "";
		int length = strs.length;
		int i=0;
		String prefix = strs[i];
		while(i < length) {
			int condition = strs[i].indexOf(prefix);
			while(condition != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);
				System.out.println("prefix "+prefix);
				condition = strs[i].indexOf(prefix);
			}
			i++;
		}
		return prefix;
	}
}
