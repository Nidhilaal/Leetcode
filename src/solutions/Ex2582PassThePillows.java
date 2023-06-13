package solutions;

import java.util.Scanner;

public class Ex2582PassThePillows {
	public int position(int n,int time) {
		int i=0;
		int pos=1;
		while(i<=n) {
			if(i<time&&i<n) {
				pos++;
				i++;
			}else if (i<time&&i==n) {
				pos--;
				i--;	
			}
			
		}
		return pos;	
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of persons:");
		int n=scanner.nextInt();
		System.out.println("Enter the no. of seconds:");
		int time=scanner.nextInt();
		scanner.close();
		Ex2582PassThePillows objPillows= new Ex2582PassThePillows();
		System.out.println(objPillows.position(n, time));
		

	}

}
