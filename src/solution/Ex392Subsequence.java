package solution;

import java.util.Scanner;

public class Ex392Subsequence {
	public boolean isSubsequence(String t,String s) {
		
		int i=0;
		int j=0;
		
		while(i<t.length() && j<s.length()) {
			if(t.charAt(i)==s.charAt(j)) {
				j++;
			}
			i++;
		}
		return j==s.length();
				
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the First String:");
		String t= scanner.nextLine();
		System.out.println("Enter the Second String: ");
		String s= scanner.nextLine();
		scanner.close();
		Ex392Subsequence objSubsequence=new Ex392Subsequence();
		System.out.println(objSubsequence.isSubsequence(t, s));
	
	}

}
