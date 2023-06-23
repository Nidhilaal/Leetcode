package solution;

public class Ex1464MaximumProduct {
	 public int maxProduct(int[] nums) {
		 int largest=Integer.MIN_VALUE;
		 int secondLargest=Integer.MIN_VALUE;
		 for(int i=0;i<nums.length;i++) {
			 if(nums[i]>=largest) {
				 secondLargest=largest;
				 largest=nums[i];		 
			 }else if(secondLargest<nums[i] && largest>nums[i]) {
				 secondLargest=nums[i];	 
			 }
			 
		 }
		 return secondLargest-1*largest-1;	   
	 }
}
