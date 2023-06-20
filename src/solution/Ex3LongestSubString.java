package solution;

import java.util.HashMap;
import java.util.Map;

public class Ex3LongestSubString {
    public int lengthOfLongestSubstring(String s) {
    	Map<Character, Integer> map=new HashMap<>();
    	int maxLength=0;
    	int start=0;
    	for(int end=0;end<s.length();end++) {
    		char rightChar=s.charAt(end);
    		if(map.containsKey(rightChar)) {
    			start=Math.max(start, map.get(rightChar)+1);
    		}
    		map.put(s.charAt(end), end);
    		maxLength=Math.max(maxLength, end-start+1);
    		
    	}
    	return maxLength;   
    }

}
