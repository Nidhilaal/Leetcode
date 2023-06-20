package solution;

import java.util.Scanner;

public class Ex14LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        		int i=0;
				int j=0;
				String s="";
				while(i<strs[0].length() && j<strs.length-1) {
					if(strs[j].charAt(i)==strs[j+1].charAt(i)) {
						s=s+strs[j].charAt(i);
						j++;
					}else if(strs.length==1) {
						s=s+strs[0].charAt(i);	
					}
					i++;		
				}					 
				return strs.length==1?strs[0].substring(0,strs[0].length()-1):s;
    }

	public static void main(String[] args) {
		System.out.println("Enter the limit of string array:");
		Scanner scanner=new Scanner(System.in);
		int limit= scanner.nextInt();
		String[] strs=new String[limit];
		System.out.println("Enter the strings: ");
		for(int i=0;i<limit;i++) {
			strs[i]=scanner.next();		
		}
		scanner.close();
		Ex14LongestCommonPrefix objCommonPrefix =new Ex14LongestCommonPrefix();
		System.out.println("Common prefix: ");
		System.out.println(objCommonPrefix.longestCommonPrefix(strs));
	}

}
