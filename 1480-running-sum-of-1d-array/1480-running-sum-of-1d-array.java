class Solution {
    public int[] runningSum(int[] a) {
        int i, j, n, sum=0;
        n=a.length;
        int b[]=new int[n];
        for(i=0;i<n;i++)
        {
            sum=0;
            for(j=0;j<=i;j++)
            {
                sum=sum+a[j];
            }
            b[i]=sum;
        }
        return b;
        
    }
}