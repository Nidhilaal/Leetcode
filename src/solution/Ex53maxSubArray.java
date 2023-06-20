package solution;

public class Ex53maxSubArray {
	
    public int maxSubArray(int[] nums) {
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            if(sum<nums[i]){
                sum=nums[i];

            }
            maxSum=Math.max(sum,maxSum);
        }
        return maxSum;	        
    }
    
}
