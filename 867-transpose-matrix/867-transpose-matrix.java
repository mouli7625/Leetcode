class Solution {
    public int[][] transpose(int[][] a) {
        int m,n,i,j;
        m= a.length;
         n= a[0].length;
        int b[][]=new int[n][m];
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                b[i][j]=a[j][i];
            }
        }
        return b; 
    }
}