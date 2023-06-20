package solution;

import java.util.Scanner;

public class SecondLargest {
	public int find(int[] arr,int limit) {
		int largest= Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		for(int i=0;i<limit;i++) {
			if(arr[i]>largest) {
				secondLargest=largest;
				largest=arr[i];
			}else if (arr[i]<largest && arr[i]>secondLargest ) {
				secondLargest=arr[i];	
			}
		}
		return secondLargest;
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
		scan.close();
		System.out.print("The second largest number in the array is: ");
		System.out.println(new SecondLargest().find(arr, limit));
		
	}

}
