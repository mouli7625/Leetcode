import java.util.*;
class Solution {
    static public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m, n,c=0, i,j, a[], term=0;
            double medi=0.0;
        m=nums1.length;
        n=nums2.length;
        c=m+n;
        a=new int [c];
        System.arraycopy(nums1,0,a,0,m);
        System.arraycopy(nums2,0,a,m,n);
        Arrays.sort(a);
        if(c%2!=0)
        {
            term=(c+1)/2;
            return (a[term-1]);
        }
        else
        {
            term=c/2;
            medi=(double)(a[term-1]+a[term])/2;
            return medi;
        }  
    }
    public static void main(String[]args)
    {
        int a[], b[], m, n, i,j;
        Scanner sc=new Scanner(System.in);
        m=sc.nextInt();
        n=sc.nextInt();
        a=new int[m];
        b=new int[n];
        for(i=0;i<m;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            b[i]=sc.nextInt();
        }
        System.out.print(findMedianSortedArrays(a, b));
    }
}