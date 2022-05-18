import java.util.*;
class Solution {
    static public int[] sortArrayByParity(int[] nums) {
        int n, i, k=0;
        n=nums.length;
        int b[]=new int[n];
        for(i=0;i<n;i++)
        {
            if(nums[i]%2==0)
            {
                b[k]=nums[i];
                k++;
            }
        }
        for(i=0;i<n;i++)
        {
            if(nums[i]%2!=0)
            {
                b[k]=nums[i];
                k++;
            }
        }
        return b; 
    }
    public static void  main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n, a[],i;
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.print(sortArrayByParity( a));
    }
}