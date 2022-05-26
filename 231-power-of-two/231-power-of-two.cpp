class Solution {
public:
    bool isPowerOfTwo(int n) {
         int i=0, x=0, cnt=0;
       if(n==0)
       {
           return false;
       }
        else
        {
            return (ceil(log2(n))==floor(log2(n)));
        }
        
    }
};