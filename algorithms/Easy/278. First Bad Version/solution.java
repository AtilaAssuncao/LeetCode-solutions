class Solution {

    // Implementação Iterativa:
    public int firstBadVersion(int n) {
        int left = 0, right = n -1, pivot = 0;
	    
	    while(left <= right) {
	        
	        pivot = left + (right - left) / 2;
	        if (isBadVersion(pivot)) {
	            right = pivot -1;
	        } else {
	            left = pivot +1;
	        }
	    }
        return left;   
    }

	/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
	public static boolean isBadVersion(int version) {
        return version == 4 ? true : false;
    }
}