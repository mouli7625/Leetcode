import java.util.*;
class Solution {
  static  public int[] twoSum(int[] nums, int target) {
         int i, l, j, x=0,cnt=0,sum=0, ans[],a=0,b=0 ;
      ans=new int[2];
      l=nums.length;
      for(i=0;i<l-1;i++)
      {
          x=nums[i];
          for(j=i+1;j<l;j++)
          {
              sum=x+nums[j];
              if(sum==target)
              {
                  a=i;
                  b=j;
                  cnt=1;
                  break;
              } 
          }
          if(cnt==1)
          {
              break;
          } 
      }
      ans[0]=a;
      ans[1]=b;
      return ans;
        
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
        System.out.print(twoSum(a,  t));
        
    }
}