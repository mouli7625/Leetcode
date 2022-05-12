import java.util.*;
class Solution {
   static public List<String> fizzBuzz(int n) {
        List<String>ans =new ArrayList<String>(n);
        int i;
        for(i=1;i<=n;i++)
        {
            if(i%3==0 && i%5==0)
            {
                ans.add("FizzBuzz");
            }
           else if(i%3==0 && i%5!=0)
            {
                ans.add("Fizz");
            }
            else if(i%3!=0 && i%5==0)
            {
                ans.add("Buzz");
            }
            else
            {
                ans.add((Integer.toString(i)));
            }
        }
        return ans;
        
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        System.out.print(fizzBuzz( n));
        
    }
}