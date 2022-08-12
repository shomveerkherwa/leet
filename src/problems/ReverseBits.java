package problems;

public class ReverseBits {

	public static void main(String[] args) {
		int n = 000101;
		System.out.println(n);
		int reversed = reverseBits(n);
		System.out.println("Reversed "+reversed);
	}

	public static int reverseBits(int n) {
		if (n == 0) 
			return 0;
        
		int result = 0;
        for(int i=0; i<32;i++) {
        	//left shift the result
        	result = result << 1;
        	
        	int add = n & 1;
        	if(add == 1) {
        		result = result + add;
            }
        	
        	//right shift the input;
        	n = n >> 1;
        }
        return result;
    }
}
