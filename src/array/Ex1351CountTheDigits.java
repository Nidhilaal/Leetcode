package array;

import java.util.Scanner;
//function to find the count of digits which can exactly divide the given number
public class Ex1351CountTheDigits {
	public int divide(int num) {
		int value=num;
		int count=0;
		while(num!=0) {
			int result=num%10;
			if(value%result==0) {
				count++;	
			}
			num=num/10;
		}
		return count;	
	}

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=scanner.nextInt();
		scanner.close();
		Ex1351CountTheDigits objCountTheDigits=new Ex1351CountTheDigits();
		System.out.println("count of the digits is: "+objCountTheDigits.divide(num));
		
	}

}
