
import java.util.*;
    class Solution {
    public int missingNumber(int[] n) {
    int l=n.length;
        int sum=((l+1)*(l))/2;
        for(int i=0;i<l;i++)
        {
               sum-=n[i];
        }
        return sum;
    }
}