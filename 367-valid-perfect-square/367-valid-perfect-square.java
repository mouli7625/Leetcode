class Solution {
    public boolean isPerfectSquare(int num) {
        int x=0;
        x=(int)Math.sqrt(num);
        if(x*x==num)
        {
            return true; 
        }
        else
        {
            return false;
        }     
        
    }
}