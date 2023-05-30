package solutions;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2656MaximumSum {
	public int sum(int[]arr,int k) {
		Arrays.sort(arr);
		int result=0;
		while(k>0) {
			result=result+arr[arr.length-1];
			arr[arr.length-1]=arr[arr.length-1]+1;
			k--;
		}
		return result;
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
		System.out.println("Enter the k value");
		int k= scan.nextInt();
		scan.close();
		Ex2656MaximumSum objSum=new Ex2656MaximumSum();
		System.out.println(objSum.sum(arr, k));

	}

}
