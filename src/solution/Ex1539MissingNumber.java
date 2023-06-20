package solution;

import java.util.Scanner;

public class Ex1539MissingNumber {
	
	public int find(int[] arr,int k) {
		for(int i : arr){
			if(i <= k) k++; else break;
		}
		return k;
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
		System.out.println("Enter the index of the missing number: ");
		int k=scan.nextInt();
		scan.close();
		Ex1539MissingNumber objNumber=new Ex1539MissingNumber();
		System.out.println("The kth missing number is: "+ objNumber.find(arr,k));
	}

}
