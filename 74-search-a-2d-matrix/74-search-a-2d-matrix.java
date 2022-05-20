import java.util.*;
class Solution {
   static public boolean searchMatrix(int[][] matrix, int target) {
        int i, j, row=0, col=0, cnt=0;
        row= matrix.length;
        col=matrix[0].length;
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                if(matrix[i][j]==target)
                {
                    cnt=1;
                    break;
                }
            }
        }
        if(cnt==1)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int m, n, a[][],i,j, target;
        m=sc.nextInt();
        n=sc.nextInt();
         target=sc.nextInt();
        a=new int[m][n];
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.print(searchMatrix(a, target));
    }
}