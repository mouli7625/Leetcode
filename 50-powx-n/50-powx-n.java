import java.util.*;
class Solution {
   static public double myPow(double x, int n) {
       if(n<0)
       {
         
           
           return(Math.pow(x,n));
       }
       else
       {
           return(Math.pow(x,n));
       }
        
    }
    
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        double x;
        x=sc.nextDouble();
        n=sc.nextInt();
        System.out.print( myPow( x, n));
    }
}