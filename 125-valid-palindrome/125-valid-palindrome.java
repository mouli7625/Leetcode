class Solution {
    public boolean isPalindrome(String s) {
        int l,i;
        String z="",reve="";
        l=s.length();
        for(i=0;i<l;i++)
        {
            if(s.charAt(i)>='a' && s.charAt(i)<='z' ||s.charAt(i)>='A' && s.charAt(i)<='Z' || s.charAt(i)>='0' && s.charAt(i)<='9' )
            {
                z=z+s.charAt(i);
            }
        }
        for(i=z.length()-1;i>=0;i--)
        {
            reve=reve+z.charAt(i);
        }
        if(reve.equalsIgnoreCase(z)){
            return true; 
        }
        else
        {
            return false;
        }
        
    }
}