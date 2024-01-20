package twenty23.array;

public class RemoveElements {

	public static void main(String[] args) {
		int[] nums = {1};
		int val = 1;
		int stop = removeElement(nums, val);
		for(int i=0; i< stop; i++) {
			System.out.print(nums[i]+ "\t");
		}
	}

	 public static int removeElement(int[] nums, int val) {
		 int start = 0;
		 int end = nums.length-1;
		 
		 //move the end pointer until there is no val number in array
		 while(end >= 0 && nums[end] == val) {
			 end--;
		 }
		 
		 while(start <= end) {
 			 if(nums[start] == val) {
				 int temp = nums[start];
				 nums[start] = nums[end];
				 nums[end]= temp;
			 }
			 
			 // meantime run the loop to stop at a place where the new number has to be picked.
			 while(end >= 0 && nums[end] == val) {
				 end--;
			 }
			 
			 start++;
		 }
		 
		 return start;
	 }
}
