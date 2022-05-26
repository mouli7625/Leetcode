class Solution {
public:
    bool isPowerOfThree(int n) {
         int i=0, x=0, cnt=0;
       if(n<=0)
       {
           return false;
       }
        if(n%3==0)
        {
            return isPowerOfThree( n/3);
        }
        if(n==1)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
};