package array;

import java.util.Scanner;

public class Ex2520CountNegativeMatrix {
	public int find(int[][] arr,int limit1,int limit2) {
		int count=0;
		for(int i=0;i<limit1;i++) {
			for(int j=0;j<limit2;j++) {
				if(arr[i][j]<0) {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the limit1:");
		int limit1=scan.nextInt();
		System.out.println("Enter the limit2:");
		int limit2=scan.nextInt();
		int [][] arr =new int [limit1][limit2];
		System.out.println("Enter the values:");
		for(int i=0;i<limit1;i++) {
			for(int j=0;j<limit2;j++) {
				arr[i][j]=scan.nextInt();
			}
		}
		scan.close();
		Ex2520CountNegativeMatrix objMay24=new Ex2520CountNegativeMatrix();
		System.out.print("Number of negative numbers is: ");
		System.out.println(objMay24.find(arr,limit1,limit2));
		
	}

}
