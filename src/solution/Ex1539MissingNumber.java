package solution;

import java.util.Scanner;

public class Ex1539MissingNumber {
	
	public int find(int[] arr,int[] temp,int k) {
		int count=0;
		int result=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=temp[i]) {
				count++;
			}
			if(count==k) {
				result=temp[i];	
			}
		}
		return result;
	}

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the limit");
		int limit= scan.nextInt();
		System.out.println("Enter the index of the missing number: ");
		int k=scan.nextInt();
		int []arr=new int[limit+k];
		System.out.println("Enter the values");
		for(int i=0;i<limit;i++) {
			arr[i]=scan.nextInt();
		}
		int []temp=new int[limit+k];
		for(int j=0;j<limit+k;j++) {
			temp[j]=j+1;
		}
		scan.close();
		Ex1539MissingNumber objNumber=new Ex1539MissingNumber();
		System.out.println("The kth missing number is: "+ objNumber.find(arr, temp, k));
	}

}
