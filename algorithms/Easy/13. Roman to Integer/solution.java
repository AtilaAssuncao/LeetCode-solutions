import java.util.*;

class Solution {
    public int romanToInt(String s) {
	    
	    Map<Character, Integer> roman = romanList();
	    
	    int accumulator = 0;
	    char letters[] = s.toCharArray();
	    
	    for(int i = 0; i < letters.length - 1; i++) {
	        if(roman.get(letters[i]) >= roman.get(letters[i+1])) {
	            accumulator += roman.get(letters[i]);
	        } else {
	            accumulator -= roman.get(letters[i]);
	        }
	    }
        
	    return accumulator + roman.get(letters[letters.length-1]);
    }
    
    public static Map<Character, Integer> romanList() {
        
        Map<Character, Integer> roman = new HashMap<Character, Integer>();
        
	    roman.put('I', 1);
	    roman.put('V', 5);
	    roman.put('X', 10);
	    roman.put('L', 50);
	    roman.put('C', 100);
	    roman.put('D', 500);
	    roman.put('M', 1000);
        
	    return roman;
    }
}