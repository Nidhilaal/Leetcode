package solution;

import java.util.Scanner;

public class Ex1662EquivalentStrings {
	
	public boolean equivalent(String[] word1,String[] word2) {
		String str1="";
		String str2="";
		for(int i=0;i<word1.length;i++) {
			str1=str1+word1[i];
		}
		for(int j=0;j<word2.length;j++) {
			str2=str2+word2[j];
		}
		if(str1.equals(str2)) {
			return true;
		}else {
			return false;		
		}	
	}

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the first limit: ");
		int limit1=scanner.nextInt();
		String [] word1= new String[limit1];
		for(int i=0;i<limit1;i++) {
			word1[i]=scanner.next();	
		}
		System.out.println("Enter the second limit: ");
		int limit2=scanner.nextInt();
		String [] word2= new String[limit2];
		for(int i=0;i<limit2;i++) {
			word2[i]=scanner.next();	
		}
		scanner.close();
		Ex1662EquivalentStrings objEquivalentStrings=new Ex1662EquivalentStrings();
		System.out.println(objEquivalentStrings.equivalent(word1, word2));
	}
}
