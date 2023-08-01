class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1  ){
            return true;
        }
        else if(n<=0){
            return false;
        }
        boolean p=((n & (n-1))==0);
            return p;  
    }
}