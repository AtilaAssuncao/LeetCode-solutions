class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        
        int aux = 0, original = x;
        while(x != 0 ) {
            aux = aux * 10 + (x % 10);
            x /= 10;
        }
        return original == aux ;
    }
}