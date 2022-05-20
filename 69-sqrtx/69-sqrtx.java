import java.util.*;
class Solution {
   static public int mySqrt(int x) {
        int sq=0;
        sq=(int)Math.sqrt(x);
        return sq;
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int x;
        x=sc.nextInt();
        System.out.print(mySqrt( x));
    }
}