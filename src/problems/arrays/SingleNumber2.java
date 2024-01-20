package problems.arrays;

import java.util.Arrays;

public class SingleNumber2 {

	public static void main(String[] args) {
		int[] nums = {-2, -2,-3, -2};
		System.out.println(Arrays.toString(nums) +" ----->"+singleNumber(nums));
		System.out.println(Arrays.toString(nums) +" ----->"+singleNumberCompact(nums));
	}

	private static int singleNumberCompact(int[] nums) {
		int ans = 0;
		
		for(int i=0; i< 32; i++) {
			int sum = 0;
			for(int n : nums) {
				if(((n >> i) & 1) == 1) {
					sum++;
				}
			}
			sum = sum % 3;
			
			if(sum != 0)
				ans = ans | (sum << i);
		}
		
		return ans;
	}

	public static int singleNumber(int[] nums) {
        int[] frequency = new int[32];
		
        for(int n : nums) {
        	String binary = new StringBuilder(Integer.toBinaryString(n)).reverse().toString();
        	int i=0;
        	for(Character c : binary.toCharArray()) {
        		if(c == '1') {
        			frequency[31 - i]++;
        		}
        		i++;
        	}
        }
        
        System.out.println(Arrays.toString(frequency));
    	
    	StringBuilder sb = new StringBuilder();
    	for(int i=0; i<32;i++) {
    		frequency[i]= frequency[i] % 3;
    		if(frequency[i] != 0)
    			sb.append("1");
    		else
    			sb.append("0");
    	}
    	
    	System.out.println(sb.toString());
    	
    	
    	Long result = Long.parseLong(sb.toString(), 2);
    	
    	return result.intValue();
        
        
    }
}
