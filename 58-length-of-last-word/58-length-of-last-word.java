class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int i;
       String a[]=s.split(" ");
        int l= a.length;
        String z=" ";
        z=a[l-1];
        return z.length();
    }
}