import java.util.*;
class Solution {
    static public boolean isPalindrome(int x) {
        int reve=0, rem=0, num=x;
        if(x<0)
        {
            return false;
        }
        else
        {
        while(x!=0)
        {
            rem=x%10;
            reve=reve*10+rem;
            x=x/10;
        }
        if(reve==num)
        {
            return true;
        }
        else
        {
            return false;
        }
        }
    }
    public static void main(String[]args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n =sc.nextInt();
        System.out.print(isPalindrome(n));
    }
}