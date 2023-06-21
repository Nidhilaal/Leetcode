package solution;

import java.util.Scanner;

public class TwoPointerSample {
	
	public int getMaxSubArrayOfSizeK(int[]arr,int k) {
		int windowSum=0;
		int maxSum=0;
		int start=0;
		int end=0;
		while(end<k) {
			windowSum+=arr[end++];
		}
		while(end<arr.length) {
			windowSum+=arr[end++]-arr[start++];
			maxSum=Math.max(windowSum, maxSum);
		}
		return maxSum;	
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the limit");
		int limit= scan.nextInt();
		int []arr=new int[limit];
		System.out.println("Enter the values");
		for(int i=0;i<limit;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the k");
		int k= scan.nextInt();
		scan.close();
		TwoPointerSample objSample=new TwoPointerSample();
		System.out.println(objSample.getMaxSubArrayOfSizeK(arr, k));
			
	}
}
