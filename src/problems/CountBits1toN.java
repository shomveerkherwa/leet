package problems;

import java.util.Arrays;

public class CountBits1toN {

	public static void main(String[] args) {
		int num = 100000000;
		//0, 1, 10, 11, 100, 101, 110, 111, 1000, 1001, 1010;
		int[] oneSInBitsArray = countBits(num);
		System.out.println(num);
		System.out.println(Arrays.toString(oneSInBitsArray));
	}
	
	public static int[] countBits(int num) {
        int[] res = new int[num + 1];
        res[0] = 0;
        
        for(int i = 1; i <= num; i++){
            if((i & 1) == 0){
                res[i] = res[i >> 1];
            }else{
                res[i] = res[i - 1] + 1;
            }
        }
        
        return res;
    }
}
