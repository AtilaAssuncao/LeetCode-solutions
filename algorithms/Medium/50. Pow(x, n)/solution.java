class Solution {
    public double myPow(double x, int n) {
        if(n < 0) return 1.0 / pow(x, n); 
        return pow(x,n);
    }
    
    private static double pow(double x, double n) {
        
        if (n == 0 || x == 1.0) return 1; 
        if (n == 1) return x;
         
        double value = pow(x, (int)(n/2));
        
        if(n%2 == 0) {
            return value * value; 
        }

        return value * value * x;
    }
}