import java.util.*;
class Solution {
   static public int reverse(int x) {
        int reve=0, p, c=0;
        if(x<0)
        {
            c=1;
        }
        x=Math.abs(x);
        while(x!=0)
        {
            p=x%10;
            x=x/10;
            if(reve>Integer.MAX_VALUE/10 || reve==Integer.MAX_VALUE/10 && p>7)
            {
                return 0; 
            }
            if(reve<Integer.MIN_VALUE/10 || reve==Integer.MIN_VALUE/10 &&p< -8)
            {
                return 0; 
            }
            
            reve=reve*10+p;
        }
        if(c==1)
        {
            reve=0-reve;
        }
       return reve;
         
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        System.out.print(reverse(n));
    }
}