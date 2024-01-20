package problems;

public class MaxDisplacement {
    public static int solution(String string, int changes) {
        int size = string.length();
        if (size < changes) 
        	return -1;
        int result = 0;
        
        for (int i = 0, p = 0; i < size; ++i) {
            if (changes > 0) {
                if (string.charAt(i) == 'R') {
                    ++p;
                    --changes;
                } else if (size - i > changes) {  
                    ++p;
                } else { 
                    --p;
                    --changes;
                }
            } else {
                p += string.charAt(i) == 'S' ? 1 : -1;
            }
            result = Math.max(result, p);   
        }
        assert changes == 0;
        return result;
    }

    public static void main(String[] args) {
        String s = "SSSRSSS";
        int m = 2;
        int result = solution(s, m);
        System.out.println(result);
    }
}

