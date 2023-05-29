package solutions;

import java.util.Scanner;

public class SubArraySum {
	public int sum(int[] arr, int k) {
		int result=0;
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=i;j<arr.length;j++) {
				sum=sum+arr[j];
				if(sum==k) {
					result++;
				}
			}
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
		SubArraySum objArraySum=new SubArraySum();
		System.out.println("Number of sub arrays which sums upto k: ");
		System.out.println(objArraySum.sum(arr, k));
	}

}
