package array;

import java.util.Scanner;

public class RemoveDupicates {
	public void remove(int arr[],int limit) {
		
		for(int i=0;i<limit;i++) {
			for(int j=i+1;j<limit;j++) {
				if(arr[i]==arr[j]) {
					arr[j]=arr[limit-1];
					limit--;
					j--;	
				}
			}
		}
		System.out.println("Result array after removing duplicates: ");
		for(int i=0;i<limit;i++) {
			System.out.println(arr[i]);
		}	
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
		RemoveDupicates objDupicates=new RemoveDupicates();
		objDupicates.remove(arr, limit);
			
	}

}
