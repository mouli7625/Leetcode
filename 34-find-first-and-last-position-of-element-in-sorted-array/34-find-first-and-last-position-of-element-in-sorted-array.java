import java.util.*;
class Solution {
   static public int[] searchRange(int[] nums, int target) {
        int b[];
        b= new int [2];
        int i, j;
        if(target==0 && nums.length==0)
        {
            b[0]=-1;
            b[1]=-1;
        }
        else
        {
            int pos=0;
            for(i=0;i<nums.length;i++)
            {
                if(nums[i]==target)
                {
                    b[0]= i;
                    pos=i;
                    break;
                }
                else
                {
                    b[0]= -1;
                }
            }
            for(i=nums.length-1;i>=0;i--)
            {
                if(nums[i]==target)
                {
                    b[1]= i;
                    break;
                }
                else
                {
                    b[1]=-1;
                }
            }
           
        }
       return b;
        
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n, a[], t,i;
        n=sc.nextInt();
        a=new int[n];
        for( i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        t=sc.nextInt();
        System.out.print(searchRange(a, t));

    }
}